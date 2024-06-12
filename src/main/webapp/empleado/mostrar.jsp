<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!--    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link href="../estilo.css" rel="stylesheet">
<title>Listado de empleados</title>
</head>
<body>
	<main>-->  
	<c:import url="/plantilla/cabecera.jsp"></c:import>

		<h1>Listado de los empleados</h1>
		
		
		<table class="fl-table">
		<thead>
			<tr>
				<th>Número de identificacion de empleado</th>
				<th>Nombre empleado</th>
				<th>Sexo</th>
				<th>Fecha nacimineto</th>
				<th>Fecha incorporacion</th>
				<th>Salario empleado</th>
				<th>Comision Empleado</th>
				<th>Cargo empleado</th>
				<th>Jefe ID</th>
				<th>Código Departamento</th>
			</tr>
		</thead>
		<tbody>
		<c:if test="${listaEmpleados==null or listaEmpleados.size()==0}">
			<h2>No se han encontrado datos de los empleados</h2>
		</c:if>
	
		<c:forEach var="emp" items="${listaEmpleados}">
	    	<tr>
	    		<td>${emp.cargoE}</td>
	    		<td>${emp.codDepto}</td>
	    		<td>${emp.comisionE}</td>
	    		<td>${emp.fecIncorporacion}</td>
	    		<td>${emp.fecNac}</td>
	    		<td>${emp.jefeID}</td>
	    		<td>${emp.nDIEmp}</td>
	    		<td>${emp.nomEmp}</td>
	    		<td>${emp.salEmp}</td>
	    		<td>${emp.sexEmp}</td>
	    		<td><a href="eliminar?nDIEmp=${emp.nDIEmp}">
	    		         <ion-icon name="close-circle-outline" class="grande"></ion-icon> 
	    		    </a>
	    		</td>
	    		<td><a href="modificar?nDIEmp=${emp.nDIEmp}">
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