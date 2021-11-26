<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	
	<jsp:useBean id="servicio" class="service.CuadradoService"></jsp:useBean>
	<jsp:useBean id="servicio2" class="service.ParService"></jsp:useBean>
	
	
	<%!
		int[] nums = {2, 4, 5};
	%>
	<%
		pageContext.setAttribute("xs", nums);
	%>
		

	<h1>JSTL</h1>

	<h2>Esperado</h2>

	<table>
		<thead>
			<tr>
				<th>Valor</th>
				<th>Cuadrado</th>
				<th>¿Es par?</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>2</td>
				<td>4</td>
				<td>si</td>
			</tr>
			<tr>
				<td>4</td>
				<td>16</td>
				<td>si</td>
			</tr>
			<tr>
				<td>5</td>
				<td>25</td>
				<td>no</td>
			</tr>
		</tbody>
	</table>


	<hr>
	<!-- Linea horizontal -->

	<h2>Obtenido</h2>

	<table>
		<thead>
			<tr>
				<th>Valor</th>
				<th>Cuadrado</th>
				<th>¿Es par?</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${xs}" var="x">
			
				<tr>
					<td>
						<c:out value="${x}"></c:out>
					</td>
					<td>
						<c:out value="${ servicio.cuadrado(x) }"></c:out>
					</td>
					<td>
						<c:choose>
							<c:when test="${ servicio2.esPar(x) }">
								si
							</c:when>
							<c:otherwise>
								no
							</c:otherwise>
						</c:choose>
					</td>
				</tr>
			
			</c:forEach>
		</tbody>
	</table>

</body>
</html>