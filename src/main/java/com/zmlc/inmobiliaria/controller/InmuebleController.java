package com.zmlc.inmobiliaria.controller;

import java.util.Optional;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zmlc.inmobiliaria.model.Inmueble;
import com.zmlc.inmobiliaria.model.Usuario;
import com.zmlc.inmobiliaria.service.InmuebleService;

@Controller
@RequestMapping("/inmuebles")
public class InmuebleController {
	
	private final Logger LOGGER = LoggerFactory.getLogger(InmuebleController.class);
	
	@Autowired
	private InmuebleService inmuebleService;
	
	@GetMapping("")
	public String show(Model model) {
		model.addAttribute("inmuebles", inmuebleService.findAll());
		return "inmuebles/showinmuebles";
	}
	
	@GetMapping("/createinmueble")
	public String createinmueble() {
		return "inmuebles/createinmueble";
	}
	
	@PostMapping("/save")
	public String save(Inmueble inmueble) {
		LOGGER.info("Este es el objeto inmueble {}", inmueble);
		Usuario u= new Usuario(1, "", "", "", "", "", "");
		inmueble.setUsuario(u);
		inmuebleService.save(inmueble);
		return "redirect:/inmuebles";
	}
	
	@GetMapping("/editinmueble/{id}")
	public String edit(@PathVariable Integer id, Model model) {
		Inmueble inmueble = new Inmueble();
		Optional<Inmueble> optionalInmueble=inmuebleService.get(id);
		inmueble = optionalInmueble.get();
		
		LOGGER.info("Inmueble buscado: {}", inmueble);
		model.addAttribute("inmueble", inmueble);
		
		return "inmuebles/editinmueble";
	}
	
	@PostMapping("/update")
	public String update(Inmueble inmueble) {
		inmuebleService.update(inmueble);
		return "redirect:/inmuebles";
	}
	
	@GetMapping("/delete/{id}")
	public String delete (@PathVariable Integer id) {
		inmuebleService.delete(id);
		return "redirect:/inmuebles";
	}

}
