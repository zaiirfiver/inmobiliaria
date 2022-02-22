package com.zmlc.inmobiliaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zmlc.inmobiliaria.model.Inmueble;
import com.zmlc.inmobiliaria.service.InmuebleService;

@Controller
@RequestMapping("/administrador")
public class AdministradorController {

	@Autowired
	private InmuebleService inmuebleService;
	
	@GetMapping("")
	public String home(Model model) {
		
		List<Inmueble> inmuebles = inmuebleService.findAll();
		model.addAttribute("inmuebles", inmuebles);
		
		return "administrador/home";
	}
}
