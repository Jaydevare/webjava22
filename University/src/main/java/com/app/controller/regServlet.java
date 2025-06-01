package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.app.dao.StudentDAO;
import com.app.model.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class regServlet
 */
@WebServlet("/RegistrationServlet")
public class regServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public regServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String uname = request.getParameter("txtName");
		Float m1 = Float.parseFloat(request.getParameter("txtM1"));
		Float m2 = Float.parseFloat(request.getParameter("txtM2"));
		Float m3 = Float.parseFloat(request.getParameter("txtM3"));
		
		Student stu = new Student();
		
		stu.setName(uname);
		stu.setS1(m1);
		stu.setS2(m2);
		stu.setS3(m3);
		
		try {
			int status = StudentDAO.regstudent(stu);
			if(status==1)
			{
				response.sendRedirect("details.html");
			}
			else
			{
				pw.write("Failed to Register");
				request.getRequestDispatcher("details.html").include(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
