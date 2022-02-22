package com.zmlc.inmobiliaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zmlc.inmobiliaria.service.InmuebleService;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private InmuebleService inmuebleService;
	
	@GetMapping("")
	public String home(Model model) {
		
		model.addAttribute("inmuebles", inmuebleService.findAll());
		
		return "usuario/home";
	}
}
