package com.oop.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Register;
import com.oop.dao.Userdao;




public class UpdateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
                String Name=request.getParameter("name");
		String StudentRegistrationNo=request.getParameter("regNo");
		String Email=request.getParameter("email");
		String Nic=request.getParameter("nic");
		String ContactNo=request.getParameter("contactNo");
		String Course=request.getParameter("course");
		
		Register register=new Register();
		register.setName(Name);
		register.setStudentRegistrationNo(StudentRegistrationNo);
		register.setEmail(Email);
		register.setNIC(Nic);
		register.setContactNo(ContactNo);
		register.setCourse(Course);
		
		Userdao auusv=new Userdao();
		if(auusv.updateRegister(register))
			response.sendRedirect("UserProfile.jsp");
		
		
	}

}
