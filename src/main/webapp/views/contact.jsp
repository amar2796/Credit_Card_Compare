<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Contact Us</title>
  <link rel="stylesheet" href="/CSS_File/contactStyle.css">
</head>
<body>
  <div class="container">
    <h1>Contact Us</h1>
    <form action="submit.php" method="post">
      <label for="name">Name</label>
      <input type="text" id="name" name="name" placeholder="Your name..." required>

      <label for="email">Email</label>
      <input type="email" id="email" name="email" placeholder="Your email..." required>

      <label for="subject">Subject</label>
      <input type="text" id="subject" name="subject" placeholder="Subject..." required>

      <label for="message">Message</label>
      <textarea id="message" name="message" placeholder="Write your message here..." required></textarea>

      <input type="submit" value="Send">
    </form>
  </div>
  <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
