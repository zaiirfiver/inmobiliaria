package com.zmlc.inmobiliaria.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zmlc.inmobiliaria.model.Cita;
import com.zmlc.inmobiliaria.model.Usuario;
import com.zmlc.inmobiliaria.service.CitaService;

@Controller
@RequestMapping("/citas")
public class CitaController {
	
	private final Logger LOGGER = LoggerFactory.getLogger(InmuebleController.class);
	
	@Autowired
	private CitaService citaService;
	
	@GetMapping("")
	public String show() {
		return "citas/showcitas";
	}
	
	@GetMapping("/createcita")
	public String createcita() {
		return "citas/createcita";
	}
	
	@PostMapping("save")
	public String save(Cita cita) {
		LOGGER.info("Este es el objeto cita {}", cita);
		Usuario u= new Usuario(1, "", "", "", "", "", "");
		cita.setUsuario(u);
		citaService.save(cita);
		return "redirect:/citas";
	}

}
