<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
	<c:import url="/plantilla/cabecera.jsp"></c:import>

		<h2>Insertar nuevo departamento</h2>
		<form method="post" action="insertar">
			<label for="codDepto"> Código: 
				<input type="text" name="codDepto" id="codDepto">
			</label>
			
			<label for="nombreDepto"> Nombre: 
				<input type="text" name="nombreDepto" id="nombreDepto">
			</label>
			
			<label for="ciudad"> Ciudad:
				<input type="text" name="ciudad" id="ciudad">
			</label>
			
			<label for="codDirector"> Código de Director:
				<input type="text" name="codDirector" id="codDirector">
			</label>
			<input type="submit" value="Nuevo Departamento">
			<input type="reset" value="Limpiar">
		</form>
		
		
		
	<c:import url="/plantilla/pie.jsp"></c:import>
		