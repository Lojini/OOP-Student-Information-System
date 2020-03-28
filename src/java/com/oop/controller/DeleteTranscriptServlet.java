
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


public class DeleteTranscriptServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public DeleteTranscriptServlet(){
		super();
	}
        

        @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
            try {
                 PrintWriter out = response.getWriter();
                 String TransId=request.getParameter("id");
              
                
                 Transcriptdao scholDao = new Transcriptdao();
                
                
                 String result=scholDao.DeleteTrans(TransId);
                
                
                 if (result.equals("SUCCESS")){
                   response.sendRedirect("request.jsp");
                 }
                   else {
                      out.println("unsuccessfull!");
                   }
            
            
            }catch (SQLException ex) {
                Logger.getLogger(DeleteTranscriptServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        
}
}
            

            
   
            

         
          




