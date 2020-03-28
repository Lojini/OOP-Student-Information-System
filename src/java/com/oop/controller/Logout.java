package com.oop.controller;
 
import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 

public class Logout extends HttpServlet {
	
        private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		response.sendRedirect("index.jsp");
		HttpSession session = request.getSession(false);
		out.println("Logged Out");
		session.removeAttribute("Username");
		session.getMaxInactiveInterval();
	}
}