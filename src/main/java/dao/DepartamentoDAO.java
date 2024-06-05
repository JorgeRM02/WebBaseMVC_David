package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Departamento;

public class DepartamentoDAO {
	
	private ConexionBD conexion;

	// Inicializa el objeto de conexion a la base de datos
	public DepartamentoDAO() {
		this.conexion =  new ConexionBD();
	}
	
	public ArrayList<Departamento> getListaDepartamentos() {
		ArrayList<Departamento> lista = new ArrayList<Departamento>();
		
		Connection con = conexion.getConexion();
		Statement sentencia = null;
		ResultSet resultado=null;
		
		try {
			sentencia = con.createStatement();
			resultado= sentencia.executeQuery(
					"SELECT * FROM departamentos");
			while (resultado.next()) {
				String codDepto = resultado.getString("codDepto");
				String nombreDpto= resultado.getString("nombreDpto");
				String ciudad = resultado.getString("ciudad");
				String codDirector=resultado.getString("codDirector");
				
				Departamento depto = new Departamento(codDepto, nombreDpto, ciudad, codDirector);
				
				lista.add(depto);
			}	
		} catch (SQLException e) {
			System.out.println("error "+ e.getMessage());
		} finally {
			try {
				resultado.close();
				sentencia.close();
				conexion.desconectar();
			} catch (SQLException e) {
				System.out.println("Error al liberar los datos");
			}
			
		}
		return lista;
	}
	
	
}
