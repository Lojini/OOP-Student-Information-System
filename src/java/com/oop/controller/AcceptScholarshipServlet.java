
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


public class AcceptScholarshipServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public AcceptScholarshipServlet() {
		super();
	}
        

        @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
            try {
                 PrintWriter out = response.getWriter();
                 String ScholId=request.getParameter("id");
                 String RequestStatus = "Accepted";
                 Scholarship accept = new Scholarship();
                
                 accept.setScholId(ScholId);
                 accept.setRequestStatus(RequestStatus);
                 Scholarshipdao scholDao = new Scholarshipdao();
                 String result=scholDao.AcceptSchol(ScholId,RequestStatus);
               
                 if(result.equals("SUCCESS")){
                   response.sendRedirect("request.jsp");
                }
                 else {
                    System.out.println("unsuccessfull!");
                 }
            
            }catch (SQLException ex) {
                Logger.getLogger(AcceptScholarshipServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        
       }
}
            

            
   
            

         
          



