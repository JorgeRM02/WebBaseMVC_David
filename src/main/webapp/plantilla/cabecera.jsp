<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link href="/WebBase/estilo.css" rel="stylesheet">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Fira+Sans+Condensed:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">
<title>Portal de gestión de datos</title>
<script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
</head>
<body>
	<header>
		<h1>Sistema de Gestión de datos</h1>
		<h2>Panel de control</h2>
	</header>
	<div class="container">
		<aside>
			<header>Administración</header>
			<nav>
				<ul>
					<li><a href="${pageContext.servletContext.contextPath}">Inicio</a></li>
					<li>Departamentos
						<a href="${pageContext.servletContext.contextPath}/departamentos/mostrar">Mostrar</a>
						<a href="${pageContext.servletContext.contextPath}/departamentos/insertar.jsp">Nuevo</a>
					</li>
					<li>Empleados
						<a href="${pageContext.servletContext.contextPath}/empleado/mostrar">Mostrar</a>
					</li>
				</ul>
			</nav>
		</aside>
		<main>