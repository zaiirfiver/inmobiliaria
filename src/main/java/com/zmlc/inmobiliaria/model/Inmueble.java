package com.zmlc.inmobiliaria.model;

public class Inmueble {
	private Integer id;
	private String nombre;
	private String descripcion;
	private String dirección;
	private String imagen;
	private double precio;
	
	public Inmueble() {
		
	}
	
	public Inmueble(Integer id, String nombre, String descripcion, String dirección, String imagen, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.dirección = dirección;
		this.imagen = imagen;
		this.precio = precio;
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
	public String getDirección() {
		return dirección;
	}
	public void setDirección(String dirección) {
		this.dirección = dirección;
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

	@Override
	public String toString() {
		return "Inmueble [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", dirección=" + dirección
				+ ", imagen=" + imagen + ", precio=" + precio + "]";
	}
	
	
	
}
