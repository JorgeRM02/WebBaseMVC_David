<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Departamento"%>
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
	
	<% ArrayList<Departamento> lista = 
	     (ArrayList<Departamento>) request.getAttribute("listaDepartamentos");
		if (lista==null) {
			out.println("<h2>No hay datos</h2>");
			return;
		}
	
	%>
	
	<table>
	
		<thead>
			<th>Código Departamento </th>
			<th>Nombre</th>
			<th>Ciudad</th>
			<th>Código Director</th>
		</thead>
		<tbody>
		
		<%
			for (Departamento d: lista ){
				out.println("<tr>");
				out.println("<td>"+d.getCodDepto()+"</td>");
				out.println("<td>"+d.getNombreDepto()+"</td>");
				out.println("<td>"+d.getCiudad()+"</td>");
				out.println("<td>"+d.getCodDirector()+"</td>");
				out.println("</tr>");
			}
		%>
		
		
		
		
		</tbody>
	</table>
	
	
	
	

</body>
</html>