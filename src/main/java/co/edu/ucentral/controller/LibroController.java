package co.edu.ucentral.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.edu.ucentral.modelo.Libros;
import co.edu.ucentral.service.LibrosService;

@Controller
@RequestMapping(value = "/libros")

public class LibroController {
	@Autowired
	private LibrosService librosService;

	@GetMapping("/index")
	public String listar(Model model) {
		List<Libros> listar = librosService.listarLibros();
		model.addAttribute("libros", listar);
		return ("libros/index");
	}
	@GetMapping("/eliminar/{id}")
	public String eliminarLibros(@PathVariable Long id) {
		librosService.eliminarLibros(id);
		return"redirect:/libros/index";
	} 
	@GetMapping("/crear")
	public String crear(Libros libro, Model model) {
		List<Libros> listar = librosService.listarLibros(); 
		model.addAttribute("libro", listar);
		return "libros/formLibros";	
	}
	@PostMapping("/guardar")
	public String guardarLibros(Libros libro) {
		librosService.guardarLibros(libro);
		return "redirect:/libros/index";	
	}
	@GetMapping("/buscar/{id}")
	public String buscarLibros(@PathVariable Long id, Model model) {
		Libros libro = librosService.buscarLibros(id);
		model.addAttribute("libros", libro);
		return "libros/formLibros";
	}
}
