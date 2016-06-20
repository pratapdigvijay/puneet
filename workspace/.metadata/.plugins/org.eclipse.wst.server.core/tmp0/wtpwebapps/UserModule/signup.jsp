<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Sign In</h1>
<p class=""><%= request.getAttribute("message") %><p>

<form action="AuthenticateServlet" method="POST">
	<input type=email name=email>
	<input type=password name=pwd>
	<input type=submit value=submit />
</form>

</body>
</html>