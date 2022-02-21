package com.zmlc.inmobiliaria.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zmlc.inmobiliaria.model.Cita;

@Repository
public interface CitaDao extends JpaRepository<Cita, Integer> {
	
	
}
