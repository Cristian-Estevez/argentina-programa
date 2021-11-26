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
	
	<% String nombre = request.getParameter("nombre"); %>
	<% String apellido = request.getParameter("apellido"); %>
	
	Es un placer conocerte, <%= nombre %> <%= apellido.toUpperCase() %>
	
	<br>
	
	<a href="ejemplo6.jsp">Volver</a>
</body>
</html>