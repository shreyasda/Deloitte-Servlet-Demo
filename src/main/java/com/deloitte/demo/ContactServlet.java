package com.deloitte.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContactServlet
 */
@WebServlet("/contact")
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet method is called");
		RequestDispatcher dispatcher = request.getRequestDispatcher("contact.jsp");
		dispatcher.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost method is called");

		String subject = req.getParameter("subject");
		System.out.println("Subject: " + subject);

		String message = req.getParameter("message");
		System.out.println("Message: " + message);

		String email = req.getParameter("email");
		System.out.println("Email: " + email);

		req.setAttribute("message", "Thank You");
		RequestDispatcher dispatcher = req.getRequestDispatcher("contact.jsp");
		dispatcher.forward(req, resp);
	}
}
