package com.zmlc.inmobiliaria.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zmlc.inmobiliaria.model.Inmueble;

@Repository
public interface InmuebleDao extends JpaRepository<Inmueble, Integer> {

}
