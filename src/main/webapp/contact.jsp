<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Contact Us</title>
</head>

<body>
	<h1>Contact Us</h1>
	<%
	    String message = (String) request.getAttribute("message");
		if (message != null) {
	%>

	<p>
		<%=message%>
	</p>
	<%
		}
	%>

	<form action="contact" method="post">
		<label for="subject">Subject:</label> 
		<br> 
		<input type="text" id="subject" name="subject" required> 
		<br> <br> 
		<label for="message">Message: </label><br>
		<textarea id="message" name="message" required> </textarea>
		<br> <br> 
		<label for="email">Email:</label>
		<br> 
		<input type="email" id="email" name="email" required> 
		<br> <br>
		<button type="submit">Submit</button>
	</form>
</body>
</html>