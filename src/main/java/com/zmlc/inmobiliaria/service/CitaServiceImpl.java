package com.zmlc.inmobiliaria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zmlc.inmobiliaria.dao.CitaDao;
import com.zmlc.inmobiliaria.model.Cita;

@Service
public class CitaServiceImpl implements CitaService {
	
	@Autowired
	private CitaDao citaDao;

	@Override
	public Cita save(Cita cita) {
		return citaDao.save(cita);
	}

	@Override
	public Optional<Cita> get(Integer id) {
		return citaDao.findById(id);
	}

	@Override
	public void update(Cita cita) {
		citaDao.save(cita);
	}

	@Override
	public void delete(Integer id) {
		citaDao.deleteById(id);
		
	}

	@Override
	public List<Cita> findAll() {
		return citaDao.findAll();
	}
	
}
