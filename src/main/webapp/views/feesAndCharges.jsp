<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Fees And Charges</title>
	<link rel="stylesheet" href="/CSS_File/fees&Charges.css">
</head>
<body>
	<form action="teamDashboardLogin">
		<div class="outer">
			<div class="heading">
				<p>Fees And Charges</p>
			</div>
		</div>
		<label >No Annual Fees:</label>
		<input type="text" id="noAnnualFees" name="noAnnualFees" required>

		<label >Membership Charges:</label>
		<input type="text" id="membershipCharges" name="membershipCharges" required>

		<label >Cashbacks:</label>
		<input type="text" id="cashbacks" name="cashbacks" required>

		<label >Low Intrest:</label>
		<input type="text" id="lowIntrest" name="lowIntrest" required>
		
		<label >Travel:</label>
		<input type="text" id="travel" name="travel" required>

		<label >Domestic Lounge:</label>
		<input type="text" id="domesticLounge" name="domesticLounge" required>

		<label >International Lounge:</label>
		<input type="text" id="internationalLounge" name="internationalLounge" required>

		<label >Balance Transfer:</label>
		<input type="text" id="balanceTransfer" name="balanceTransfer" required>

        <label >International Transaction:</label>
		<input type="text" id="internationalTransaction" name="internationalTransaction" required>


		<input type="submit" value="Submit">
	</form>
</body>
</html>
>