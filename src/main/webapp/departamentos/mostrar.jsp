<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Departamento"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %> 


<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Listado de departamentos</title>
<link href="estilo.css" rel="stylesheet" >
</head>
<body>
	<h1>Listado de departamentos</h1>
	
		<c:if test="${listaDepartamentos==null or listaDepartamentos.size()==0}">
			<h2> No se han encontrado datos de los departamentos</h2>
		</c:if> 
	
	<table>
	
		<thead>
			<th>Código Departamento </th>
			<th>Nombre</th>
			<th>Ciudad</th>
			<th>Código Director</th>
		</thead>
		<tbody>
		

		
		<c:forEach var="d" items="${listaDepartamentos}">
			<tr>
				<td>${d.codDepto}</td>
				<td>${d.nombreDepto}</td>
				<td>${d.ciudad}</td>
				<td>${d.codDirector}</td>
			</tr>
		</c:forEach>
		
		
		
		</tbody>
	</table>
	
	
	
	

</body>
</html>