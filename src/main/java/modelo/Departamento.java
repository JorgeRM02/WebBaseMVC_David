package modelo;

import java.util.Objects;

public class Departamento {

	private String codDepto;
	private String nombreDepto;
	private String ciudad;
	private String codDirector;
	
	public Departamento() {
		this.codDepto="";
		this.nombreDepto="";
		this.codDirector="";
		this.ciudad="";
	}

	public Departamento(String codDepto, String nombreDepto, String ciudad, String codDirector) {
		super();
		this.codDepto = codDepto;
		this.nombreDepto = nombreDepto;
		this.ciudad = ciudad;
		this.codDirector = codDirector;
	}

	public String getCodDepto() {
		return codDepto;
	}

	public void setCodDepto(String codDepto) {
		this.codDepto = codDepto;
	}

	public String getNombreDepto() {
		return nombreDepto;
	}

	public void setNombreDepto(String nombreDepto) {
		this.nombreDepto = nombreDepto;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCodDirector() {
		return codDirector;
	}

	public void setCodDirector(String codDirector) {
		this.codDirector = codDirector;
	}

	@Override
	public String toString() {
		return "Departamento [codDepto=" + codDepto + ", nombreDepto=" + nombreDepto + ", ciudad=" + ciudad
				+ ", codDirector=" + codDirector + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codDepto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		return Objects.equals(codDepto, other.codDepto);
	}
	
	
	
	
}
