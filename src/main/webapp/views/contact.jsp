<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>My Website</title>
	<style>
		body {
			font-family: Arial, sans-serif;
			background-color: #f2f2f2;
			margin: 0;
		}
		header {
			background-color: #333;
			color: #fff;
			padding: 20px;
			text-align: center;
		}
		nav {
			position: sticky;
            top: 0;
            width: 100%;
			background-color: #4CAF50;
			overflow: hidden;
		}
		nav a {
			float: left;
			display: block;
			color: #fff;
			text-align: center;
			padding: 14px 16px;
			text-decoration: none;
			font-size: 18px;
		}
		nav a:hover {
			background-color: #3e8e41;
		}
		@media (max-width: 600px) {
			nav a {
				float: none;
				display: block;
				text-align: left;
			}
		}
		footer {
			background-color: #333;
			color: #fff;
			padding: 20px;
			text-align: center;
			position: absolute;
			bottom: 0;
			width: 100%;
		}
		.active{
			background-color: black;
		}
	</style>
</head>
<body>
	<header>
		<h1>Welcome to My Website</h1>
	</header>

	<nav>
		<a href="home">Home</a>
		<a href="#">Registration</a>
		<a href="#">Login</a>
		<a href="#">View Card</a>
		<a href="#">About</a>
		<a class="active" href="#">Contact</a>
	</nav>

	<main>
		${data }
		<p>8127991402</p>
	</main>

	<footer>
		<p>&copy; 2023 My Website. All rights reserved.</p>
	</footer>
</body>
</html>
