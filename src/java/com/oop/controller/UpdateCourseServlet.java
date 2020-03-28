
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

import com.oop.model.Course;
import com.oop.dao.Coursedao;


public class UpdateCourseServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public UpdateCourseServlet() 
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
                  String CourseId=request.getParameter("id");
                
                
                  String CourseName = request.getParameter("CourseName");
                  String CourseDetails = request.getParameter("CourseDetails");
                  String Fees = request.getParameter("Fees");
                
             
                  Course updatecourse = new Course();
                  updatecourse.setCourseId(CourseId);
                  updatecourse.setCourseName(CourseName);
                  updatecourse.setCourseDetails(CourseDetails);
                  updatecourse.setFees(Fees);
                 
                  Coursedao courseDao = new Coursedao();
                
                
                  String result=courseDao.UpdateCourse(updatecourse);
                
                
                  if(result.equals("SUCCESS")){
                   response.sendRedirect("ListCourses.jsp");
                  }
                    else{
                     out.println("unsuccessfull!");
                   }
            
            
            }catch (SQLException ex) {
                Logger.getLogger(UpdateCourseServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        
}
}
            

            
   
            

         
          




