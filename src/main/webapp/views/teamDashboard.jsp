
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html >
<html>
<head>
	<title>Admin Dashboard</title>
	<link rel="stylesheet" type="text/css" href="/CSS_File/teamDashboardStyle.css">
</head>
<body>
	<header>
		<h1>Team Dashboard</h1>
		<nav>
			<ul>
				<li><a href="#">Logout</a></li>
			</ul>
		</nav>
	</header>
	<main>
		<section class="overview">
			<h2>Dashboard Overview</h2>
			Latest Bank Id ${bank }
			<div class="card">
				<h3>Add Bank Details</h3>
				<p><a href="addBank">Click here</a></p>
			</div>
		
			<div class="card">
				<h3>Add Card Details</h3>
				<p><a href="addCardDashboard">Click here</a></p>
			</div>
			
			</section>
		<section class="user-list">
			<h2>User List</h2>
			<table>
				<thead>
					<tr>
						<th>Name</th>
						<th>Email</th>
						<th>Role</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>John Doe</td>
						<td>johndoe@example.com</td>
						<td>Admin</td>
						<td><a href="#">Edit</a> | <a href="#">Delete</a></td>
					</tr>
					<tr>
						<td>Jane Doe</td>
						<td>janedoe@example.com</td>
						<td>User</td>
						<td><a href="#">Edit</a> | <a href="#">Delete</a></td>
					</tr>
					<tr>
						<td>James Smith</td>
						<td>jamessmith@example.com</td>
						<td>User</td>
						<td><a href="#">Edit</a> | <a href="#">Delete</a></td>
					</tr>
				</tbody>
			</table>
		</section>
	</main>
	<footer>
		<p>&copy; 2023 Team Dashboard</p>
	</footer>
</body>
</html>
