package com.zmlc.inmobiliaria.service;

import java.util.List;
import java.util.Optional;

import com.zmlc.inmobiliaria.model.Usuario;


public interface IUsuarioService {
	Optional<Usuario> findById(Integer id);
	Usuario save(Usuario usuario);
	Optional<Usuario> findByEmail(String email);
	List<Usuario> findAll();
	

}