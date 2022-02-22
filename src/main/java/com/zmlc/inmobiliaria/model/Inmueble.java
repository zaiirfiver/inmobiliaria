package com.zmlc.inmobiliaria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "inmuebles")
public class Inmueble {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String descripcion;
	private String direccion;
	private String imagen;
	private double precio;
	
	@ManyToOne
	private Usuario usuario;
	
	public Inmueble() {
		
	}
	
	

	public Inmueble(Integer id, String nombre, String descripcion, String direccion, String imagen, double precio,
			Usuario usuario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.imagen = imagen;
		this.precio = precio;
		this.usuario = usuario;
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDirección(String direccion) {
		this.direccion = direccion;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Inmueble [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", direccion=" + direccion
				+ ", imagen=" + imagen + ", precio=" + precio + "]";
	}
	
	
	
}
