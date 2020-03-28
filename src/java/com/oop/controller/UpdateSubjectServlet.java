
package com.oop.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.oop.model.Subject;
import com.oop.dao.Subjectdao;
import java.io.PrintWriter;


public class UpdateSubjectServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public UpdateSubjectServlet(){
		super();
	}
        
        @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

        @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
            try {
                  PrintWriter out = response.getWriter();
                  String SubjectId=request.getParameter("id");
                  String SubjectName = request.getParameter("SubjectName");
                  String CourseId = request.getParameter("CourseId");
                  String CourseName=request.getParameter("CourseName");
                  String Credits=request.getParameter("Credits");
                
                  Subject updatesubject = new Subject();
                
                  updatesubject.setSubjectId(SubjectId);
                  updatesubject.setSubjectName(SubjectName);
                  updatesubject.setCourseId(CourseId);
                  updatesubject.setCourseName(CourseName);
                  updatesubject.setCredits(Credits);
                 
                  Subjectdao subjectDao = new Subjectdao();
                  String result=subjectDao.UpdateSubject(updatesubject);
                 if (result.equals("SUCCESS")){
                   response.sendRedirect("ListSubjects.jsp");
                 }
                    else{
                        out.println("unsuccessfull!");
                    }
                }catch (SQLException ex) {
                Logger.getLogger(UpdateSubjectServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
            

            
   
            

         
          




