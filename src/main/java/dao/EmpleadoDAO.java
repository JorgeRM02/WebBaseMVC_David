package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Empleado;

public class EmpleadoDAO {
	
	private ConexionBD conexion;

	// Inicializa el objeto de conexion a la base de datos
	public EmpleadoDAO() {
		this.conexion =  new ConexionBD();
	}
	
	public ArrayList<Empleado> getListaEmpleados() {
		ArrayList<Empleado> lista = new ArrayList<Empleado>();
		
		Connection con = conexion.getConexion();
		Statement sentencia = null;
		ResultSet resultado=null;
		
		try {
			sentencia = con.createStatement();
			resultado= sentencia.executeQuery(
					"SELECT * FROM empleados");
			while (resultado.next()) {
				String cargoE = resultado.getString("cargoE");
				String codDepto= resultado.getString("codDepto");
				float comisionE= resultado.getFloat("comisionE");
				Date fecIncorporacion= resultado.getDate("fecIncorporacion");
				Date fecNac= resultado.getDate("fecNac");
				String jefeID= resultado.getString("jefeID");
				String nDIEmp= resultado.getString("nDIEmp");
				String nomEmp= resultado.getString("nomEmp");
				float salEmp= resultado.getFloat("salEmp");
				String sexEmp= resultado.getString("sexEmp");
				
				Empleado emp = new Empleado(cargoE,codDepto,comisionE,fecIncorporacion,fecNac,jefeID,nDIEmp, nomEmp,salEmp,sexEmp);
				
				lista.add(emp);
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
	
	public Empleado getEmpleado(String nDIEmp) {
		
		Connection con = conexion.getConexion();
		PreparedStatement sentencia = null;
		ResultSet resultado=null;
		Empleado emp=null;
		
		try {
			sentencia = con.prepareStatement("SELECT * FROM empleados where nDIEmp=?");
			sentencia.setString(1, nDIEmp);
			resultado= sentencia.executeQuery();
			if (resultado.next()) {
				String cargoE = resultado.getString("cargoE");
				float comisionE= resultado.getFloat("comisionE");
				Date fecIncorporacion= resultado.getDate("fecIncorporacion");
				Date fecNac= resultado.getDate("fecNac");
				String jefeID= resultado.getString("jefeID");
				String codDepto= resultado.getString("codDepto");
				String nomEmp= resultado.getString("nomEmp");
				float salEmp= resultado.getFloat("salEmp");
				String sexEmp= resultado.getString("sexEmp");
				
				emp = new Empleado(cargoE,codDepto,comisionE,fecIncorporacion,fecNac,jefeID,nDIEmp, nomEmp,salEmp,sexEmp);
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
		return emp;
	}
	
	public int insertarDepartamento(Empleado emp) {
		
		Connection con = conexion.getConexion();
		PreparedStatement sentencia = null;
		ResultSet resultado=null;
		
		try {
			sentencia = con.prepareStatement(
					"insert into departamentos (cargoE, codDepto, jefeID, nDIEmp, nomEmp, secEmp, fecIncorporacion, fecnac, salEmp)"
					+" values (?,?,?,?,?,?,?,?,?)");
			sentencia.setString(1, emp.getCargoE());
			sentencia.setString(2, emp.getCodDepto());
			sentencia.setString(3, emp.getJefeID());
			sentencia.setString(4, emp.getnDIEmp());
			sentencia.setString(5, emp.getNomEmp());
			sentencia.setString(6, emp.getSexEmp());
			sentencia.setDate(7, emp.getFecIncorporacion());
			sentencia.setDate(8, emp.getFecNac());
			sentencia.setFloat(9, emp.getSalEmp());
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
	
	
	public int modificarEmpleado(Empleado emp) {
		
		Connection con = conexion.getConexion();
		PreparedStatement sentencia = null;
		ResultSet resultado=null;
		
		try {
			sentencia = con.prepareStatement(
					"update departamentos "
					+ "set cargoE=?, jodDpto=?, jefeID=?, nDIEmp=?, nomEmp=?, sexEmp=?, fecIncorporacion=?, fecNac=?, salEmp=?)"
					+" where nDIEmp=?");
			sentencia.setString(1, emp.getCargoE());
			sentencia.setString(2, emp.getCodDepto());
			sentencia.setString(3, emp.getJefeID());
			sentencia.setString(4, emp.getnDIEmp());
			sentencia.setString(5, emp.getNomEmp());
			sentencia.setString(6, emp.getSexEmp());
			sentencia.setDate(7, emp.getFecIncorporacion());
			sentencia.setDate(8, emp.getFecNac());
			sentencia.setFloat(9, emp.getSalEmp());
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
	
public int eliminarempleado(String nDIEmp) {
		
		Connection con = conexion.getConexion();
		PreparedStatement sentencia = null;
		ResultSet resultado=null;
		
		try {
			sentencia = con.prepareStatement(
					"delete from empleados "
					+ " where dNIEmp=?");
			sentencia.setString(1, nDIEmp);
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
