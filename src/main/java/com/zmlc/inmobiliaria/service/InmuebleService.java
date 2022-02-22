package com.zmlc.inmobiliaria.service;

import java.util.List;
import java.util.Optional;

import com.zmlc.inmobiliaria.model.Inmueble;

public interface InmuebleService {
	public Inmueble save(Inmueble inmueble);
	public Optional<Inmueble> get(Integer id);
	public void update (Inmueble inmueble);
	public void delete (Integer id);
	public List<Inmueble> findAll();
}
