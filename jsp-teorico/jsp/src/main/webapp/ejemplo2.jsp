<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Scriptlets</h1>

	<h2>Esperado</h2>

	<ul>
		<li>Item 01</li>
		<li>Item 02</li>
		<li>Item 03</li>
	</ul>

	<p>Es mayor</p>

	<hr>
	<!-- Linea horizontal -->

	<h2>Obtenido</h2>

	<ul>
	<%
		for (int i = 1; i <= 3; i++){ 
		%>
			<li><% out.println("item 0" + i); %></li>
		<% 
		} 
	%>
	</ul>

	<%
		int a = 11;
		if (a > 10) {
			out.println("Es mayor");
		}	
	%>

</body>
</html>