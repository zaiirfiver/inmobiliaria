package com.zmlc.inmobiliaria.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zmlc.inmobiliaria.model.Inmueble;
import com.zmlc.inmobiliaria.service.InmuebleService;

@Controller
@RequestMapping("/")
public class HomeController {
	
	private final Logger log= LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private InmuebleService inmuebleService;
	
	@GetMapping("")
	public String home(Model model) {
		
		model.addAttribute("inmuebles", inmuebleService.findAll());
		
		return "usuario/home";
	}
	
	@GetMapping("inmueblehome/{id}")
	public String inmuebleHome(@PathVariable Integer id, Model model) {
		log.info("id enviado como parametro {}", id);
		Inmueble inmueble = new Inmueble();
		Optional<Inmueble> inmuebleOptional= inmuebleService.get(id);
		inmueble = inmuebleOptional.get();
		
		model.addAttribute("inmueble", inmueble);
		
		return "usuario/inmueblehome";
	}
	
	@PostMapping("/schedule")
	public String addSchedule() {
		return "usuario/agenda";
	}
}
