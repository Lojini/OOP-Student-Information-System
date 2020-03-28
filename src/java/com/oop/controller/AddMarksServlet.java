/**
 *
 * @author Pavidha Lojini
 */
package com.oop.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Marks;
import com.oop.dao.Marksdao;
import com.oop.dao.IMarksdao;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation to Add Marks
 */
@WebServlet(name = "AddMarksServlet", urlPatterns = {"/AddMarksServlet"})
public class AddMarksServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
        /**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddMarksServlet(){
		super();
	}
        /**
         * @param request
         * @param response
         * @throws javax.servlet.ServletException
         * @throws java.io.IOException
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
        @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}
	/**
         * @param request
         * @param response
         * @throws javax.servlet.ServletException
         * @throws java.io.IOException
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
        @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
           
                  String StudentId = request.getParameter("StudentId");
                  String SubjectName = request.getParameter("SubjectName");
                  int Assignment = Integer.parseInt(request.getParameter("Assignment"));
                  int MidMarks = Integer.parseInt(request.getParameter("MidMarks"));
                  int FinalMarks = Integer.parseInt(request.getParameter("FinalMarks"));
                
                   Marks addmarks = new Marks();
                
                   addmarks.setMarksId(SubjectName,StudentId);
                   addmarks.setStudentId(StudentId);
                   addmarks.setSubjectName(SubjectName);
                   addmarks.setAssignmentMarks(Assignment);
                   addmarks.setMidMarks(MidMarks);
                   addmarks.setFinalMarks(FinalMarks);
                
                 
                 IMarksdao imarks = new Marksdao();
		 imarks.addMarks(addmarks);

		 request.setAttribute("addmarks", addmarks);
		 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/marks.jsp");
		 dispatcher.forward(request, response);
        }
}
            

            
   
            

         
          



