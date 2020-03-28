
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



public class AddTranscriptServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public AddTranscriptServlet(){
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
                  String NIC = request.getParameter("NIC");
                  String PhoneNum = request.getParameter("PhoneNum");
                  String StudyProgram = request.getParameter("StudyProgram");
                  String Address = request.getParameter("Address");
                
                  Transcript addTrans = new Transcript();
                
                  addTrans.setTransId(RegNum);
                  addTrans.setName(Name);
                  addTrans.setRegNum(RegNum);
                  addTrans.setEmail(Email);
                  addTrans.setNIC(NIC);
                  addTrans.setPhoneNum(PhoneNum);
                  addTrans.setStudyProgram(StudyProgram);
                  addTrans.setAddress(Address);
                
                
                  Transcriptdao TransDao = new Transcriptdao();
                
                
                  String result=TransDao.addTranscript(addTrans);
                
                
                  if(result.equals("SUCCESS")){
                   response.sendRedirect("transcript.jsp");
                  }
                    else{
                       out.println("unsuccessfull!");
                    }
            
            
            }catch (SQLException ex) {
                Logger.getLogger(AddTranscriptServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        
}
}
            

            
   
            

         
          



