<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!--    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link href="../estilo.css" rel="stylesheet">
<title>Listado de departamentos</title>
</head>
<body>
	<main>-->  
	<c:import url="/plantilla/cabecera.jsp"></c:import>

		<h1>Listado de los departamentos</h1>
		
		
		<table class="fl-table">
		<thead>
			<tr>
				<th>Código de Departamento</th>
				<th>Nombre</th>
				<th> Ciudad </th>
				<th>Código Director</th>
				<th>Eliminar</th>
				<th>Modificar</th>
			</tr>
		</thead>
		<tbody>
		<c:if test="${listaDepartamentos==null or listaDepartamentos.size()==0}">
			<h2>No se han encontrado datos de los departamentos</h2>
		</c:if>
	
		<c:forEach var="depto" items="${listaDepartamentos}">
	    	<tr>
	    		<td>${depto.codDepto}</td>
	    		<td>${depto.nombreDepto}</td>
	    		<td>${depto.ciudad}</td>
	    		<td>${depto.codDirector}</td>
	    		<td><a href="eliminar?codDepto=${depto.codDepto}">
	    		         <ion-icon name="close-circle-outline" class="grande"></ion-icon> 
	    		    </a>
	    		</td>
	    		<td><a href="modificar?codDepto=${depto.codDepto}">
	    		         <ion-icon name="pencil-outline" class="grande"></ion-icon> 
	    		    </a>
	    		</td>
	    	</tr> 
		</c:forEach>
		</tbody>
		</table>
		<c:import url="/plantilla/pie.jsp"></c:import>
		<!--  
		</main>
</body>
</html>-->