package controladores;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Departamento;

import java.io.IOException;
import java.util.ArrayList;

import dao.DepartamentoDAO;

/**
 * Servlet implementation class MostrarDepartamentosServlet
 */
public class MostrarDepartamentosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MostrarDepartamentosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// instanciamos un objeto DepartamentoDAO para obtener los departamentos de la base de datos
		DepartamentoDAO dao = new DepartamentoDAO();
		
		// Recoger la lista de Departamentos de la base de datos
		ArrayList<Departamento> lista = dao.getListaDepartamentos();
		
		// Enviamos la lista a la petición para tenerla en la pagina jsp
		request.setAttribute("listaDepartamentos", lista);
		
		// Enviamos los datos a la petición y redirirgimos a la web jsp
		RequestDispatcher dispatcher = request.getRequestDispatcher("mostrar.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
