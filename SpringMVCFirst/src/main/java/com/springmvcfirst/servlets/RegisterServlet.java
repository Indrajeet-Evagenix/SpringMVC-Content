package com.springmvcfirst.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.springmvcfirst.model.Student;

/**
 * Servlet implementation class RegisterServlet
 */

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String check = request.getParameter("check");

		System.out.println(name);
		System.out.println(email);
		System.out.println(password);
		System.out.println(check);

		List<Student> list = new ArrayList<Student>();

		PrintWriter pw = response.getWriter();

		for (Student st : list) {

			pw.println(st.getName());
			pw.println(st.getEmail());
			pw.println(st.getPassword());

		}
	}

}
