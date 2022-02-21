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
@Table(name = "detalles")
public class DetalleCita {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String horario;
	private Date fechavisita;
	
	@OneToOne
	private Cita cita;
	
	@ManyToOne
	private Inmueble inmueble;
	
	public DetalleCita() {
		
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
	
	public Cita getCita() {
		return cita;
	}

	public void setCita(Cita cita) {
		this.cita = cita;
	}

	public Inmueble getInmueble() {
		return inmueble;
	}

	public void setInmueble(Inmueble inmueble) {
		this.inmueble = inmueble;
	}

	@Override
	public String toString() {
		return "DetalleCita [id=" + id + ", nombre=" + nombre + ", horario=" + horario + "]";
	}
	
	

}
