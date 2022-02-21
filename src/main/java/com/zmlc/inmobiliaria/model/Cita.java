package com.zmlc.inmobiliaria.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Cita {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Date fecha;
	private String hora;
	
	@ManyToOne
	private Usuario usuario;
	
	@OneToOne(mappedBy = "cita")
	private DetalleCita detalle;
	
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
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public DetalleCita getDetalle() {
		return detalle;
	}

	public void setDetalle(DetalleCita detalle) {
		this.detalle = detalle;
	}

	@Override
	public String toString() {
		return "Cita [id=" + id + ", fecha=" + fecha + ", hora=" + hora + "]";
	}
	
	

}
