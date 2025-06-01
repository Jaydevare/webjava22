package com.app.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.app.dao.StudentDAO;
import com.app.model.Student;

/**
 * Servlet implementation class resultServlet
 */
@WebServlet("/ResultServlet") 
public class resultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public resultServlet() {
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
		
		int prn = Integer.parseInt(request.getParameter("txtPrn"));
		
		try {
			Student s = StudentDAO.getStudent(prn);
			pw.write("<html><body><table border='1' style='margin:auto'>");
			pw.write("<tr><th>PRN</th><th>NAME</th><th>SUBJECT1</th><th>SUBJECT2</th><th>SUBJECT3</th></tr>");
			pw.write("<tr><td>"+s.getPrn()+"</td><td>"+s.getName()+"</td><td>"+s.getS1()+"</td><td>"+s.getS2()+"</td><td>"+s.getS3()+"</td></tr>");
			pw.write("</table></body></html>");
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
