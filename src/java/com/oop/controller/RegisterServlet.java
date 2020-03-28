/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop.controller;
//import java.io.*;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.apache.catalina.webresources.TomcatURLStreamHandlerFactory.register;
import static org.apache.tomcat.jni.Lock.name;


import com.oop.model.Register;
import com.oop.dao.Userdao;
/**
 *
 * @author Hilton
 */
/**
 * Servlet implementation class RegisterHandler
 */
@WebServlet("/RegisterHandler")
public class RegisterServlet extends HttpServlet {
	
        private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
        public RegisterServlet() {
             super();
        }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
                String Name=request.getParameter("name");
                String StudentRegistrationNo=request.getParameter("regNo");
		String Email=request.getParameter("email");
                String NIC=request.getParameter("nic");
                String ContactNo=request.getParameter("contactNo");
		String Password=request.getParameter("password");	
                String Course=request.getParameter("course");
		
		Register register=new Register();
                
		register.setName(Name);
                register.setStudentRegistrationNo(StudentRegistrationNo);
		register.setEmail(Email);
                register.setNIC(NIC);
                register.setContactNo(ContactNo);
		register.setPassword(Password);
		register.setCourse(Course);
                
		Userdao regsv=new Userdao();
		if(regsv.insertRegister(register))
		     response.sendRedirect("login.jsp");
		
	}

}

