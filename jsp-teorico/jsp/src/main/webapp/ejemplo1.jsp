<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Expresiones</h1>
	
	<h2>Esperado</h2>
	
	<ul>
		<li>Item 01</li>
		<li>Item 02</li>
		<li>Item 03</li>
	</ul>
	
	<hr>
	
	<h2>Obtenido</h2>
	
	<ul>
		<li>Item <%= "0" + 1 %></li>
		<li>Item <%= "0" + (1 + 1) %></li>
		<li>Item <%= "0" + (1 + 1 + 1) %></li>
	</ul>
</body>
</html>