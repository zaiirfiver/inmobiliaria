package com.zmlc.inmobiliaria.model;

import java.util.Date;

public class DetalleCita {
	
	private Integer id;
	private String nombre;
	private String horario;
	private Date fechavisita;
	
	public DetalleCita() {
		// TODO Auto-generated constructor stub
	}

	public DetalleCita(Integer id, String nombre, String horario, Date fechavisita) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.horario = horario;
		this.fechavisita = fechavisita;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Date getFechavisita() {
		return fechavisita;
	}

	public void setFechavisita(Date fechavisita) {
		this.fechavisita = fechavisita;
	}

	@Override
	public String toString() {
		return "DetalleCita [id=" + id + ", nombre=" + nombre + ", horario=" + horario + "]";
	}
	
	

}
