
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


public class AddCourseServlet extends HttpServlet {

        private static final long serialVersionUID = 1L;
	
        public AddCourseServlet(){
		super();
	}
       

        @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
            try{
                
                PrintWriter out = response.getWriter();
                String CourseId = request.getParameter("CourseId");
                String CourseName = request.getParameter("CourseName");
                String CourseDetails = request.getParameter("CourseDetails");
                String Fees = request.getParameter("Fees");
               
                Course addcourse = new Course();
                
                addcourse.setCourseId(CourseId);
                addcourse.setCourseName(CourseName);
                addcourse.setCourseDetails(CourseDetails);
                addcourse.setFees(Fees);
                
                Coursedao courseDao = new Coursedao();
                String result=courseDao.addCourse(addcourse);
                if (result.equals("SUCCESS")){
                   response.sendRedirect("course-admin.jsp");
                }
                else {
                      out.println("unsuccessfull!");
                }
            }catch (SQLException ex) {
                Logger.getLogger(AddCourseServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
}
            

            
   
            

         
          



