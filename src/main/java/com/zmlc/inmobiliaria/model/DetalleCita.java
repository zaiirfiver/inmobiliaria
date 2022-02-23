package com.zmlc.inmobiliaria.model;

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
	private String dia;
	private String mes;
	private String horario;
	
	@OneToOne
	private Cita cita;
	
	@ManyToOne
	private Inmueble inmueble;
	
	public DetalleCita() {
		
	}

	public DetalleCita(Integer id, String dia, String mes, String horario) {
		super();
		this.id = id;
		this.dia = dia;
		this.mes = horario;
		this.horario = horario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Cita getCita() {
		return cita;
	}

	public void setCita(Cita cita) {
		this.cita = cita;
	}

	@Override
	public String toString() {
		return "DetalleCita [id=" + id + ", dia=" + dia + ", mes=" + mes + ", horario=" + horario + ", cita=" + cita
				+ "]";
	}


	

}