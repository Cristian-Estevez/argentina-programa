<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
td {
	background-color: lightgray;
}
</style>
<title>Insert title here</title>
</head>
<body>

	<c:set var="data" value="Rojo Verde Azul"></c:set>

	<h1>JSTL: funciones</h1>

	<h2>Esperado</h2>

	<p>"Rojo Verde Azul" dividido es...</p>

	<ul>
		<li>Rojo</li>
		<li>Verde</li>
		<li>Azul</li>
	</ul>
	
	<p> y nuevamente junto es... </p>
	<p>Rojo, Verde, Azul</p>

	<hr>
	<!-- Linea horizontal -->

	<h2>Obtenido</h2>
	
	<p>"<c:out value="${ data }"></c:out>" dividido es...</p>

	<c:set var="colores" value="${fn:split(data, ' ')}"></c:set>

	<ul>
		<c:forEach items="${ colores }" var="color">
		<li><c:out value="${ color }"></c:out></li>		
		
		</c:forEach>
	</ul>
	
	
	<p> y nuevamente junto es... </p>
	
	<c:set var="todos" value="${fn:join(colores, ', ')}"></c:set>
	<p><c:out value="${todos}"></c:out></p>
	



</body>
</html>