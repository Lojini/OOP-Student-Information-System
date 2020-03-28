package com.oop.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import javax.servlet.http.HttpSession;

import com.oop.model.Login;
import com.oop.dao.Userdao;




public class LoginServlet extends HttpServlet {
	
        private static final long serialVersionUID = 1L;

    
        public LoginServlet() {
              super();
        }



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                             
                               
		
		String Username=request.getParameter("user_name");
		String Password=request.getParameter("user_password");
				
                Login login=new Login();
	        login.setUsername(Username);
		login.setPassword(Password);
                            
	 			
	        Userdao regsv=new Userdao();
				
                                    
		if (Username.equals("admin") && Password.equals("admin123")){
			    HttpSession session = request.getSession();
			    session.setAttribute("Username", Username);
			    response.sendRedirect("student.jsp");
                }
                                 
		    else if (regsv.checkLogin(login)){
                            HttpSession session = request.getSession();
			    session.setAttribute("Username", Username);
			    response.sendRedirect("UserProfile.jsp");
		    }
		    else {
			    response.sendRedirect("login.jsp");
		    }
	}

}
