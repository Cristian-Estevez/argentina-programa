<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Salud-o-matic</h1>
	
	<%= request.getParameter("nombre") %>
	<br>
	<%= request.getParameter("apellido") %>	
	
	<form action="ejemplo6b.jsp">
	
		<p>Nombre: <input name="nombre"/></p>
		<p>Apellido: <input name="apellido"></p>
		<button type="submit">¡Saludar!</button>
	
	</form>

</body>
</html>