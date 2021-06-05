package com.empresa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fuente")
public class Fuente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idfuente")
	private Integer idFuente;
	
	private String nombre;
	
	private String certificacion;
	
	private String proteccion;
	
	private String voltage;

	public Integer getIdFuente() {
		return idFuente;
	}

	public void setIdFuente(Integer idFuente) {
		this.idFuente = idFuente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCertificacion() {
		return certificacion;
	}

	public void setCertificacion(String certificacion) {
		this.certificacion = certificacion;
	}

	public String getProteccion() {
		return proteccion;
	}

	public void setProteccion(String proteccion) {
		this.proteccion = proteccion;
	}

	public String getVoltage() {
		return voltage;
	}

	public void setVoltage(String voltage) {
		this.voltage = voltage;
	}

	
}
