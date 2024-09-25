<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body data-bs-theme="dark">
<br>
	<div class="container">
		<h3>Login Form:</h3>
		<div class="row">
			<div class="col-4 border border-solid mx-3 my-3 px-3 py-3">
				<form class="form form-group" action="login" method="POST">
					<label for='name'>Username:</label> 
						<input class="form-control mt-3 mb-3 px-2 py-2" type='text' id='name'
						name='name' placeholder="Enter Username" required><label for='password'>Password:</label> 
						<input class="form-control mt-3 mb-3 px-2 py-2" type='password'
						id='password' name='password' placeholder="Enter Password" required>
					<input class="form-control" type="submit" value="Login" id="">
				</form>
			</div>
		</div>
		<%
		String message = (String) request.getAttribute("message");
		if (message != null) {
		%>
		<p class="lead"><%=message%></p>
		<%
		}
		%>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>