package com.deloitte.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayServlet
 */
@WebServlet("/display")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set response content type to HTML
		response.setContentType("text/html");
		
		// Write the HTML form directly in the response
		response.getWriter().println("<html><body>");
		response.getWriter().println("<h2>Submit Data to DisplayServlet</h2>");
		response.getWriter().println("<form action='display' method='POST'>");
		response.getWriter().println("<label for='name'>Name:</label>");
		response.getWriter().println("<input type='text' id='name' name='name'><br><br>");
		response.getWriter().println("<label for='message'>Message:</label>");
		response.getWriter().println("<textarea id='message' name='message'></textarea><br><br>");
		response.getWriter().println("<input type='submit' value='Submit'>");
		response.getWriter().println("</form>");
		response.getWriter().println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Get the submitted form data
		String name = request.getParameter("name");
		String message = request.getParameter("message");

		// Set response content type to HTML
		response.setContentType("text/html");

		// Display the received data
		response.getWriter().println("<html><body>");
		response.getWriter().println("<h1>Data received via POST</h1>");
		response.getWriter().println("<p>Name: " + name + "</p>");
		response.getWriter().println("<p>Message: " + message + "</p>");
		response.getWriter().println("</body></html>");
	}

}
