<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Registration Form</title>
	<link rel="stylesheet" href="/CSS_File/cashbacks.css">
</head>
<body>
	<form action="lifeTimeFeeCreditCard">
		<div class="outer">
			<div class="heading">
				<p>Cashbacks</p>
			</div>
		</div>
		<label >Welcome Benefits:</label>
		<input type="text" id="welcomeBenefits" name="welcomeBenefits" required>

		<label >Milestone Benefits:</label>
		<input type="text" id="milestoneBenefits" name="milestoneBenefits" required>

		<label >Travel Benefits:</label>
		<input type="text" id="travelBenefits" name="travelBenefits" required>

		<label >Movies and Dining Benefits:</label>
		<input type="text" id="moviesAndDiningBenefits" name="moviesAndDiningBenefits" required>
		
		<label >Rewards and Features:</label>
		<input type="text" id="rewardsAndFeatures" name="rewardsAndFeatures" required>

		<label >Online Spends:</label>
		<input type="text" id="onlineSpends" name="onlineSpends" required>

        <label >Offline Spends:</label>
		<input type="text" id="offlineSpends" name="offlineSpends" required>


		<label >Fuels:</label>
		<input type="text" id="fuels" name="fuels" required>

		<label >e-Commerce Cashbacks:</label>
		<input type="text" id="eCommerceCashbacks" name="eCommerceCashbacks" required>

		<input type="submit" value="Submit">
	</form>
</body>
</html>
