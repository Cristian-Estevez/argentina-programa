<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

	<%!
		int cuadrado(int x) { return x * x; }
	%>

	<h1>Declaraciones</h1>

	<h2>Esperado</h2>

	<table>
		<thead>
			<tr>
				<th>Valor</th>
				<th>Cuadrado</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>2</td>
				<td>4</td>
			</tr>
			<tr>
				<td>4</td>
				<td>16</td>
			</tr>
			<tr>
				<td>5</td>
				<td>25</td>
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
			</tr>
		</thead>
		<tbody>
			<%
			int[] valores = {2, 4 ,5};
			
			for (int i : valores){
			%>

			<tr>
				<td><%= i %></td>
				<td><%= cuadrado(i) %></td>
			</tr>

			<% } %>

		</tbody>
	</table>

</body>
</html>