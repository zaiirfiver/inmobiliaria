package com.zmlc.inmobiliaria.controller;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.zmlc.inmobiliaria.model.Inmueble;
import com.zmlc.inmobiliaria.model.Usuario;
import com.zmlc.inmobiliaria.service.IUsuarioService;
import com.zmlc.inmobiliaria.service.InmuebleService;
import com.zmlc.inmobiliaria.service.UploadFileService;

@Controller
@RequestMapping("/inmuebles")
public class InmuebleController {
	
	private final Logger LOGGER = LoggerFactory.getLogger(InmuebleController.class);
	
	@Autowired
	private InmuebleService inmuebleService;
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@Autowired
	private UploadFileService upload;
	
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
	public String save(Inmueble inmueble, @RequestParam("img") MultipartFile file, HttpSession session) throws IOException {
		LOGGER.info("Este es el objeto inmueble {}", inmueble);
		
		
		Usuario u= usuarioService.findById(Integer.parseInt(session.getAttribute("idusuario").toString())).get();
		inmueble.setUsuario(u);
		
		//imagen
		if (inmueble.getId()==null) { 	//cuando se crea un inmueble
			String nombreImagen = upload.saveImage(file);
			inmueble.setImagen(nombreImagen);
		} 
		
		
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
	public String update(Inmueble inmueble, @RequestParam("img") MultipartFile file) throws IOException {
		Inmueble i = new Inmueble();
		i = inmuebleService.get(inmueble.getId()).get();
		
		if (file.isEmpty()) { 		//editar el inmueble pero no se cambia la imagen
			
			inmueble.setImagen(i.getImagen());
		}else { //cuando se edita tambien la imagen
			
			//eliminar cuando no sea la imagen por defecto
			if (!i.getImagen().equals("default.jpg")) {
				upload.deleteImage(i.getImagen());
			}
			
			String nombreImagen = upload.saveImage(file);
			inmueble.setImagen(nombreImagen);
		}
		inmueble.setUsuario(i.getUsuario());
		inmuebleService.update(inmueble);
		return "redirect:/inmuebles";
	}
	
	@GetMapping("/delete/{id}")
	public String delete (@PathVariable Integer id) {
		
		Inmueble i = new Inmueble();
		i = inmuebleService.get(id).get();
		
		//eliminar cuando no sea la imagen por defecto
		if (!i.getImagen().equals("default.jpg")) {
			upload.deleteImage(i.getImagen());
		}
		
		inmuebleService.delete(id);
		return "redirect:/inmuebles";
	}

}
