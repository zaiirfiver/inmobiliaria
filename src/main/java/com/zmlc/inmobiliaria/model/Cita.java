package com.zmlc.inmobiliaria.model;

import java.util.Date;

public class Cita {
	private Integer id;
	private Date fecha;
	private String hora;
	
	public Cita() {
		// TODO Auto-generated constructor stub
	}

	public Cita(Integer id, Date fecha, String hora) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.hora = hora;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "Cita [id=" + id + ", fecha=" + fecha + ", hora=" + hora + "]";
	}
	
	

}
