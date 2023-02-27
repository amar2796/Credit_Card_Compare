<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Six Cards with Grid</title>
	<style>
		.container {
			display: grid;
			grid-template-columns: repeat(3, 1fr);
			grid-gap: 1rem;
		}
		.card {
			background-color: #f2f2f2;
			padding: 1rem;
			border-radius: 5px;
			box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.3);
			text-align: center;
			overflow: hidden;
		}
		.card img {
			max-width: 100%;
			height: auto;
			object-fit: cover;
		}
		.card h3 {
			margin-top: 0;
			font-size: 1.5rem;
		}
		.card p {
			font-size: 1rem;
		}
	</style>
</head>
<body>
	<div class="container">
		<div class="card">
			<img src="https://via.placeholder.com/300x200" alt="Card Image">
			<h3>Card Title 1</h3>
			<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
		</div>
		<div class="card">
			<img src="https://via.placeholder.com/300x200" alt="Card Image">
			<h3>Card Title 2</h3>
			<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
		</div>
		<div class="card">
			<img src="https://via.placeholder.com/300x200" alt="Card Image">
			<h3>Card Title 3</h3>
			<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
		</div>
		<div class="card">
			<img src="https://via.placeholder.com/300x200" alt="Card Image">
			<h3>Card Title 4</h3>
			<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
		</div>
		<div class="card">
			<img src="https://via.placeholder.com/300x200" alt="Card Image">
			<h3>Card Title 5</h3>
			<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
		</div>
		<div class="card">
			<img src="https://via.placeholder.com/300x200" alt="Card Image">
			<h3>Card Title 6</h3>
			<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
		</div>
	</div>
</body>
</html>
