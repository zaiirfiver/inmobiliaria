package com.zmlc.inmobiliaria.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zmlc.inmobiliaria.dao.InmuebleDao;
import com.zmlc.inmobiliaria.model.Inmueble;

@Service
public class InmuebleServiceImpl implements InmuebleService {
	
	@Autowired
	private InmuebleDao inmuebleDao;

	@Override
	public Inmueble save(Inmueble inmueble) {
		return inmuebleDao.save(inmueble);
	}

	@Override
	public Optional<Inmueble> get(Integer id) {
		return inmuebleDao.findById(id);
	}

	@Override
	public void update(Inmueble inmueble) {
		inmuebleDao.save(inmueble);
	}

	@Override
	public void delete(Integer id) {
		inmuebleDao.deleteById(id);
		
	}

}
