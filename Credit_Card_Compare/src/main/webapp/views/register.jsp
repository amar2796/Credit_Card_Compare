<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Register Page</h1>
<form action="addRegister">
Enter Full name<input type="text" id="fullName" name="fullName"><br>
Enter User id<input type="text" id="userId" name="userId"><br>
Enter User email<input type="text" id="userEmail" name="userEmail"><br>
Enter User password<input type="text" id="userPassword" name="userPassword"><br>
<input type="submit" />
</form>
<a href="getUser">Views Data</a>
</body>
</html>