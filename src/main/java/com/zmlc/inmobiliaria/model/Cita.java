package com.zmlc.inmobiliaria.model;

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
	private Integer dia;
	private String mes;
	private String horario;
	
	@ManyToOne
	private Usuario usuario;
	
	@OneToOne(mappedBy = "cita")
	private DetalleCita detalle;
	
	public Cita() {
		// TODO Auto-generated constructor stub
	}

	

	public Cita(Integer id, Integer dia, String mes, String horario) {
		super();
		this.id = id;
		this.dia = dia;
		this.mes = mes;
		this.horario = horario;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Integer getDia() {
		return dia;
	}



	public void setDia(Integer dia) {
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



	public DetalleCita getDetalle() {
		return detalle;
	}



	public void setDetalle(DetalleCita detalle) {
		this.detalle = detalle;
	}

	public Usuario getUsuario() {
		return usuario;
	}



	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}



	@Override
	public String toString() {
		return "Cita [id=" + id + ", dia=" + dia + ", mes=" + mes + ", horario=" + horario + ", usuario=" + usuario
				+ ", detalle=" + detalle + "]";
	}

}