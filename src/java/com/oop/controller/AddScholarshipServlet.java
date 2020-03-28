
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

import com.oop.model.Scholarship;
import com.oop.dao.Scholarshipdao;


public class AddScholarshipServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public AddScholarshipServlet(){
		super();
	}

        @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
            try {
                 PrintWriter out = response.getWriter();
                 String Name = request.getParameter("Name");
                 String RegNum = request.getParameter("RegNum");
                 String Email = request.getParameter("Email");
                 String StudyProgram = request.getParameter("StudyProgram");
                 double gpa = Double.parseDouble(request.getParameter("gpa"));
                 String NIC = request.getParameter("NIC");
                 Scholarship addschol = new Scholarship();
           
                 addschol.setScholId(RegNum);
                 addschol.setName(Name);
                 addschol.setRegNum(RegNum);
                 addschol.setEmail(Email);
                 addschol.setStudyProgram(StudyProgram);
                 addschol.setgpa(gpa);
                 addschol.setNIC(NIC);
                
                 Scholarshipdao scholDao = new Scholarshipdao();
                 String result=scholDao.addSchol(addschol);
                 if(result.equals("SUCCESS")){
                   response.sendRedirect("schol.jsp");
                 }
                   else {
                         out.println("unsuccessfull!");
                   }
            
            }catch (SQLException ex) {
                Logger.getLogger(AddScholarshipServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        
}
}
            

            
   
            

         
          



