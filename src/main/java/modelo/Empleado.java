package modelo;

import java.sql.Date;
import java.util.Objects;

public class Empleado {
	private String cargoE;
	private String codDepto;
	private float comisionE;
	private Date fecIncorporacion;
	private Date fecNac;
	private String jefeID;
	private String nDIEmp;
	private String nomEmp;
	private float salEmp;
	private String sexEmp;
	
	
	// CONSTRUCTOR SIN PARAMETROS
	public Empleado() {
		super();
		this.cargoE = "";
		this.codDepto = "";
		this.comisionE = 0;
		this.fecIncorporacion = new Date(0);
		this.fecNac =new Date(0) ;
		this.jefeID = "";
		this.nDIEmp = "";
		this.nomEmp = "";
		this.salEmp = 0;
		this.sexEmp = "";
	}
		
	// CONSTRUCTOR CON PARAMETROS	
	public Empleado(String cargoE, String codDpto, float comisionE, Date fecIncorporacion, Date fecNac, String jefeID,
			String nDIEmp, String nomEmp, float salEmp, String sexEmp) {
		super();
		this.cargoE = cargoE;
		this.codDepto = codDpto;
		this.comisionE = comisionE;
		this.fecIncorporacion = fecIncorporacion;
		this.fecNac = fecNac;
		this.jefeID = jefeID;
		this.nDIEmp = nDIEmp;
		this.nomEmp = nomEmp;
		this.salEmp = salEmp;
		this.sexEmp = sexEmp;
	}


	// GETTERS Y SETTERS
	public String getCargoE() {
		return cargoE;
	}


	public void setCargoE(String cargoE) {
		this.cargoE = cargoE;
	}


	public String getCodDepto() {
		return codDepto;
	}


	public void setCodDepto(String codDpto) {
		this.codDepto = codDpto;
	}


	public float getComisionE() {
		return comisionE;
	}


	public void setComisionE(float comisionE) {
		this.comisionE = comisionE;
	}


	public Date getFecIncorporacion() {
		return fecIncorporacion;
	}


	public void setFecIncorporacion(Date fecIncorporacion) {
		this.fecIncorporacion = fecIncorporacion;
	}


	public Date getFecNac() {
		return fecNac;
	}


	public void setFecNac(Date fecNac) {
		this.fecNac = fecNac;
	}


	public String getJefeID() {
		return jefeID;
	}


	public void setJefeID(String jefeID) {
		this.jefeID = jefeID;
	}


	public String getnDIEmp() {
		return nDIEmp;
	}


	public void setnDIEmp(String nDIEmp) {
		this.nDIEmp = nDIEmp;
	}


	public String getNomEmp() {
		return nomEmp;
	}


	public void setNomEmp(String nomEmp) {
		this.nomEmp = nomEmp;
	}


	public float getSalEmp() {
		return salEmp;
	}


	public void setSalEmp(float salEmp) {
		this.salEmp = salEmp;
	}


	public String getSexEmp() {
		return sexEmp;
	}


	public void setSexEmp(String sexEmp) {
		this.sexEmp = sexEmp;
	}

	
	
	// METODO TO-STRING
	@Override
	public String toString() {
		return "Emplados [cargoE=" + cargoE + ", codDpto=" + codDepto + ", comisionE=" + comisionE
				+ ", fecIncorporacion=" + fecIncorporacion + ", fecNac=" + fecNac + ", jefeID=" + jefeID + ", nDIEmp="
				+ nDIEmp + ", nomEmp=" + nomEmp + ", salEmp=" + salEmp + ", sexEmp=" + sexEmp + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(jefeID);
	}

	
	// METODO HASH CODE
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(jefeID, other.jefeID);
	}
	
	
	
	
	
	
	
	
	
}
