package com.zmlc.inmobiliaria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zmlc.inmobiliaria.dao.IUsuarioDao;
import com.zmlc.inmobiliaria.model.Usuario;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private IUsuarioDao usuarioDao;

	@Override
	public Optional<Usuario> findById(Integer id) {
		return usuarioDao.findById(id);
	}

	@Override
	public Usuario save(Usuario usuario) {
		return usuarioDao.save(usuario);
	}

	@Override
	public Optional<Usuario> findByEmail(String email) {
		return usuarioDao.findByEmail(email);
	}

	@Override
	public List<Usuario> findAll() {
		return usuarioDao.findAll();
	}


	
	
}
