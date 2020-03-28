
package com.oop.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


import com.oop.model.Subject;
import com.oop.dao.Subjectdao;


public class AddSubjectServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public AddSubjectServlet() 
        {
		super();
	}
        
        @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

        @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 

        {
            try {
                
                 PrintWriter out = response.getWriter();   
                 String SubjectId = request.getParameter("SubjectId");
                 String SubjectName = request.getParameter("SubjectName");
                 String CourseId = request.getParameter("CourseId");
                 String CourseName = request.getParameter("CourseName");
                 String Credits = request.getParameter("Credits");
                 
                 Subject addsubject = new Subject();
                
                 addsubject.setSubjectId(SubjectId);
                 addsubject.setSubjectName(SubjectName);
                 addsubject.setCourseId(CourseId);
                 addsubject.setCourseName(CourseName);
                 addsubject.setCredits(Credits);
                 Subjectdao subjectDao = new Subjectdao();
                 String result=subjectDao.addSubject(addsubject);
                
                if (result.equals("SUCCESS")){
                   response.sendRedirect("sub-admin.jsp");
                }
                   else {
                         out.println("unsuccessfull!");
                   }
            
            
            }catch (SQLException ex) {
                Logger.getLogger(AddSubjectServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        
}
}
            

            
   
            

         
          



