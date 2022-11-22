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
import co.edu.ucentral.service.EstadoService;

@Controller
@RequestMapping(value = "/estados")
public class EstadoController {
	
	@Autowired
	private EstadoService estadoService;
	
	@GetMapping("/index")
	public String listar(Model model) {
		List<Estado> listar = estadoService.listarEstado();
		model.addAttribute("estados",listar);
		return ("estados/index");
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminarEstado(@PathVariable Long id) {
		estadoService.eliminarEstado(id);
		return"redirect:/estados/index";
	}
	
	@GetMapping("/crear")
	public String crear(Estado estado, Model model) {
		List<Estado> listar = estadoService.listarEstado(); 
		model.addAttribute("estados", listar);
		return "estados/formEstados";	
	}
	
	@PostMapping("/guardar")
	public String guardarEstado(Estado estado) {
		estadoService.guardarEstado(estado);
		return "redirect:/estados/index";	
	}
	
	@GetMapping("/buscar/{id}")
	public String buscarEstado(@PathVariable Long id, Model model) {
		Estado estado = estadoService.buscarEstado(id);
		model.addAttribute("estado", estado);
		return "estados/formEstados";
	}
}
