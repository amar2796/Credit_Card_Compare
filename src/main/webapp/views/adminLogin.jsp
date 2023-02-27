<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Login Form</title>
	<link rel="stylesheet" href="/CSS_File/teamLogin.css">
</head>
<body>
	<form action="adminLoginValidate" >
		<label class="error">${error } </label>
		<label for="userId">User id:</label>
		<input type="text" id="userId" name="userId" required>

		<label for="password">Password:</label>
		<input type="password" id="password" name="password" required>

		<input type="submit" value="Login">
	</form>
</body>
</html>
