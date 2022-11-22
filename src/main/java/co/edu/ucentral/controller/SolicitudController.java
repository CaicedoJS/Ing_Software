package co.edu.ucentral.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.edu.ucentral.modelo.Estado;
import co.edu.ucentral.modelo.Libros;
import co.edu.ucentral.modelo.Persona;
import co.edu.ucentral.modelo.Solicitud;
import co.edu.ucentral.service.EstadoService;
import co.edu.ucentral.service.LibrosService;
import co.edu.ucentral.service.PersonaService;
import co.edu.ucentral.service.SolicitudService;

@Controller
@RequestMapping(value = "/solicitudes")

public class SolicitudController {
	@Autowired
	private SolicitudService solicitudService;
	@Autowired
	private LibrosService librosService;
	@Autowired
	private PersonaService personaService;
	@Autowired
	private EstadoService estadoService;

	@GetMapping("/crear")
	public String crear(Solicitud solicitud, Model model) {
		List<Solicitud> listar = solicitudService.listarSolicitud(); 
		model.addAttribute("solicitudes", listar);
		List<Libros> listarLibros = librosService.listarLibros(); 
		model.addAttribute("libros", listarLibros);
		List<Persona> listarPersonas = personaService.listarPersona(); 
		model.addAttribute("personas", listarPersonas);
		List<Estado> listarEstados = estadoService.listarEstado(); 
		model.addAttribute("estados", listarEstados);
		return "solicitudes/index";	
	}
	@PostMapping("/guardar")
	public String guardarSolicitud(Solicitud solicitud) {
		solicitudService.guardarSolicitud(solicitud);
		return "redirect:/";	
	}
	@GetMapping("/buscar/{id}")
	public String buscarSolicitud(@PathVariable Long id, Model model) {
		Solicitud solicitud = solicitudService.buscarSolicitud(id); 
		model.addAttribute("solicitud", solicitud);
		List<Libros> listarLibros = librosService.listarLibros(); 
		model.addAttribute("libros", listarLibros);
		List<Persona> listarPersonas = personaService.listarPersona(); 
		model.addAttribute("personas", listarPersonas);
		List<Estado> listarEstado = estadoService.listarEstado(); 
		model.addAttribute("estados", listarEstado);
		return "/solicitudes/index";	
	}
}
