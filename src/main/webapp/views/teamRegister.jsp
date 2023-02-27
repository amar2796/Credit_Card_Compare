<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Registration Form</title>
	<link rel="stylesheet" href="/CSS_File/registrationStyle.css">
</head>
<body>
	<form action="/teamAddRegister">
		<div class="outer">
			<div class="heading">
				<p>Team Registration Form</p>
			</div>
		</div>
		<label >Full Name:</label>
		<input type="text" id="fullName" name="fullName" required>

		<label >User id:</label>
		<input type="text" id="userId" name="userId" required>

		<label >Password:</label>
		<input type="password" id="password" name="password" required>

		<label >Mobile Number:</label>
		<input type="number" id="mobileNumber" name="mobileNumber" required>
		
		<label >Email:</label>
		<input type="email" id="email" name="email" required>

		<div class="genderDiv">
			<label for="gender">Gender:</label>
			<input type="radio" id="male" name="gender" value="male">
			<label for="male">Male</label>
			<input type="radio" id="female" name="gender" value="female">
			<label for="female">Female</label>
			<input type="radio" id="other" name="gender" value="other">
			<label for="other">Other</label>
		</div>
		

		<label>Full Address:</label>
		<input type="text" id="fullAddress" name="fullAddress" required>

		

		<input type="submit" value="Submit">
	</form>
</body>
</html>
