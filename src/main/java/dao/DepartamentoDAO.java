package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
	
	public Departamento getDepartamento(String codDepto) {
		
		Connection con = conexion.getConexion();
		PreparedStatement sentencia = null;
		ResultSet resultado=null;
		Departamento depto=null;
		
		try {
			sentencia = con.prepareStatement("SELECT * FROM departamentos where codDepto=?");
			sentencia.setString(1, codDepto);
			resultado= sentencia.executeQuery();
			if (resultado.next()) {
				String nombreDpto= resultado.getString("nombreDpto");
				String ciudad = resultado.getString("ciudad");
				String codDirector=resultado.getString("codDirector");
				
				depto = new Departamento(codDepto, nombreDpto, ciudad, codDirector);
			}	
		} catch (SQLException e) {
			System.out.println("error al recuperar departamento "+ e.getMessage());
		} finally {
			try {
				resultado.close();
				sentencia.close();
				conexion.desconectar();
			} catch (SQLException e) {
				System.out.println("Error al liberar los datos");
			}
			
		}
		return depto;
	}
	
	public int insertarDepartamento(Departamento depto) {
		
		Connection con = conexion.getConexion();
		PreparedStatement sentencia = null;
		ResultSet resultado=null;
		
		try {
			sentencia = con.prepareStatement(
					"insert into departamentos (codDepto, nombreDpto, ciudad, codDirector)"
					+" values (?,?,?,?)");
			sentencia.setString(1, depto.getCodDepto());
			sentencia.setString(2, depto.getNombreDepto());
			sentencia.setString(3, depto.getCiudad());
			sentencia.setString(4, depto.getCodDirector());
			resultado= sentencia.executeQuery();
			return 1;
		} catch (SQLException e) {
			System.out.println("error al insertar datos "+ e.getMessage());
		} finally {
			try {
				resultado.close();
				sentencia.close();
				conexion.desconectar();
			} catch (SQLException e) {
				System.out.println("Error al liberar los datos");
			}
			
		}
		return 0;
	}
	
	
	public int modificarDepartamento(Departamento depto) {
		
		Connection con = conexion.getConexion();
		PreparedStatement sentencia = null;
		ResultSet resultado=null;
		
		try {
			sentencia = con.prepareStatement(
					"update departamentos "
					+ "set nombreDpto=?, ciudad=?, codDirector=?)"
					+" where codDepto=?");
			sentencia.setString(1, depto.getNombreDepto());
			sentencia.setString(2, depto.getCiudad());
			sentencia.setString(3, depto.getCodDirector());
			sentencia.setString(4, depto.getCodDepto());
			resultado= sentencia.executeQuery();
			return 1;
		} catch (SQLException e) {
			System.out.println("error al actualizar los  datos "+ e.getMessage());
		} finally {
			try {
				resultado.close();
				sentencia.close();
				conexion.desconectar();
			} catch (SQLException e) {
				System.out.println("Error al liberar los datos");
			}
			
		}
		return 0;
	}
	
public int eliminarDepartamento(String codDepto) {
		
		Connection con = conexion.getConexion();
		PreparedStatement sentencia = null;
		ResultSet resultado=null;
		
		try {
			sentencia = con.prepareStatement(
					"delete from departamentos "
					+ " where codDepto=?");
			sentencia.setString(1, codDepto);
			resultado= sentencia.executeQuery();
			return 1;
		} catch (SQLException e) {
			System.out.println("error al eliminar los  datos "+ e.getMessage());
		} finally {
			try {
				resultado.close();
				sentencia.close();
				conexion.desconectar();
			} catch (SQLException e) {
				System.out.println("Error al liberar los datos");
			}
			
		}
		return 0;
	}
}
