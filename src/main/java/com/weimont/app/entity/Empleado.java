package com.weimont.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleados")
public class Empleado {

	@Id
	@Column(name="idEmpleado")
	private Long idEmpleado;
	
	@Column(name="nomEmp")
	private String nomEmp;
	
	@Column(name="puestoEmp")
	private String puestoEmp;
	
	@Column(name="telEmp")
	private Long telEmp;
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Empleado(Long idEmpleado, String nomEmp, String puestoEmp, Long telEmp) {
		super();
		this.idEmpleado = idEmpleado;
		this.nomEmp = nomEmp;
		this.puestoEmp = puestoEmp;
		this.telEmp = telEmp;
	}



	public Long getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNomEmp() {
		return nomEmp;
	}

	public void setNomEmp(String nomEmp) {
		this.nomEmp = nomEmp;
	}

	public String getPuestoEmp() {
		return puestoEmp;
	}

	public void setPuestoEmp(String puestoEmp) {
		this.puestoEmp = puestoEmp;
	}

	public Long getTelEmp() {
		return telEmp;
	}

	public void setTelEmp(Long telEmp) {
		this.telEmp = telEmp;
	}

	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nomEmp=" + nomEmp + ", puestoEmp=" + puestoEmp + ", telEmp="
				+ telEmp + "]";
	}
	
	
}
