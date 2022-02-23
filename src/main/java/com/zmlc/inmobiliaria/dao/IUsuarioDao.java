package com.zmlc.inmobiliaria.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zmlc.inmobiliaria.model.Usuario;

@Repository
	public interface IUsuarioDao extends JpaRepository<Usuario, Integer>{
		Optional<Usuario> findByEmail(String email);
}
