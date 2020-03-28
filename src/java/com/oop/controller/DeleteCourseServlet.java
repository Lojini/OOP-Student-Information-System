
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


public class DeleteCourseServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public DeleteCourseServlet() {
		super();
	}
        
        @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
            try {
                  PrintWriter out = response.getWriter();
                  String CourseId=request.getParameter("id");
                  Coursedao courseDao = new Coursedao();
                  String result=courseDao.DeleteCourse(CourseId);
                
                  if (result.equals("SUCCESS")){
                   response.sendRedirect("ListCourses.jsp");
                  }
                    else {
                        out.println("unsuccessfull!");
                    }
            
            
            }catch (SQLException ex) {
                Logger.getLogger(DeleteCourseServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        
}
}
            

            
   
            

         
          




