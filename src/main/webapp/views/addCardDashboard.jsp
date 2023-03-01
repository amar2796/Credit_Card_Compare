<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Add Card Details Dashboard</title>
  <link rel="stylesheet" href="CSS_File/addCardDashboardStyle.css">
</head>
<body>
  <header>
    <h1>Add Card Details Dashboard</h1>
    
  </header>
  
  <main>
    <h2>Add Card Type Details</h2>
    <form action="addCardRegister">
    <label>${bankId }</label>
      <label for="bankid">Bank Id:</label>
      <input type="number" id="bankid" name="bankid" required>
      
      <label for="card_type">Card Type:</label>
      <input type="text" id="card_type" name="card_type" required>
      
     
      
      <button type="submit">Add Card Account</button>
    </form>
  </main>
</body>
</html>
