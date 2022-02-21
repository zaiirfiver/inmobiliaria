package com.zmlc.inmobiliaria.service;

import java.util.Optional;

import com.zmlc.inmobiliaria.model.Cita;

public interface CitaService {
	public Cita save(Cita cita);
	public Optional<Cita> get(Integer id);
	public void update (Cita cita);
	public void delete (Integer id);
	
}
