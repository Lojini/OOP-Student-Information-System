
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


public class DeleteSubjectServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public DeleteSubjectServlet(){
		super();
	}
        

        @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
            try {
                  PrintWriter out = response.getWriter(); 
                  String SubjectId=request.getParameter("id");
              
                
                  Subjectdao subjectDao = new Subjectdao();
                
                
                  String result=subjectDao.DeleteSubject(SubjectId);
                
                
                  if (result.equals("SUCCESS")){
                   response.sendRedirect("ListSubjects.jsp");
                  }
                    else{
                           out.println("unsuccessfull!");
                    }
            
            
            }catch (SQLException ex) {
                Logger.getLogger(AddSubjectServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        
}
}
            

            
   
            

         
          




