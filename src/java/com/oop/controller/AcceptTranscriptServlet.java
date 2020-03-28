
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

import com.oop.model.Transcript;
import com.oop.dao.Transcriptdao;


public class AcceptTranscriptServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public AcceptTranscriptServlet() 
        {
		super();
	}
        

        @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 

        {
            try {
                
                  PrintWriter out = response.getWriter();
                  String TransId=request.getParameter("id");
                  String RequestStatus = "Accepted";
               
                
                  Transcript accept = new Transcript();
                
                  accept.setTransId(TransId);
                  accept.setRequestStatus(RequestStatus);
               
              
                
                  Transcriptdao transDao = new Transcriptdao();
                
                
                  String result=transDao.AcceptTrans(TransId,RequestStatus);
               
                
                  if(result.equals("SUCCESS")){
                     response.sendRedirect("request.jsp");
                  }
                    else{
                        out.println("unsuccessfull!");
                    }
            
            
            }catch (SQLException ex) {
                Logger.getLogger(AcceptTranscriptServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        
       }
}
            

            
   
            

         
          



