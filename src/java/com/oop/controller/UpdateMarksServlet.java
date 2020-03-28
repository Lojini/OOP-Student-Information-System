
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
 * Servlet implementation to Update Marks
 */
@WebServlet(name = "UpdateMarksServlet", urlPatterns = {"/UpdateMarksServlet"})
public class UpdateMarksServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
        
        /**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateMarksServlet() {
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
			throws ServletException, IOException{
            
                String StudentId=request.getParameter("id");
                String SubName = request.getParameter("SubName");
                int Assignment = Integer.parseInt(request.getParameter("Assignment"));
                int MidMarks=Integer.parseInt(request.getParameter("MidMarks"));
                int FinalMarks=Integer.parseInt(request.getParameter("FinalMarks"));
                
             
                Marks updatemarks = new Marks();
                updatemarks.setMarksId(SubName,StudentId);
                updatemarks.setStudentId(StudentId);
                updatemarks.setAssignmentMarks(Assignment);
                updatemarks.setMidMarks(MidMarks);
                updatemarks.setFinalMarks(FinalMarks);
                 
                IMarksdao imarksDao = new Marksdao();
                imarksDao.UpdateMarks(updatemarks);
         
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/marks.jsp");
		dispatcher.forward(request, response);
        }
}
            

            
   
            

         
          




