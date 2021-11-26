<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

	<% String flash = (String) request.getAttribute("flash"); %>
	<% if (flash != null) { %>
	<%= flash %>	
	<% } %>
	<form action="login" method="post">
		username: <input name="username" /> <br> 
		contraseña: <input name="password" type="password" /> <br> 
			<input type="submit" value="Ingresar" />
	</form>
</body>
</html>