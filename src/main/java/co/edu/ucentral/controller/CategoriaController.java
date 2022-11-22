package co.edu.ucentral.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.edu.ucentral.modelo.Categoria;
import co.edu.ucentral.service.CategoriaService;

@Controller
@RequestMapping(value = "/categorias")

public class CategoriaController {
	@Autowired
	private CategoriaService categoriaService;

	@GetMapping("/index")
	public String listar(Model model) {
		List<Categoria> listar = categoriaService.listarCategoria();
		model.addAttribute("categorias", listar);
		return ("categorias/index");
	}
	@GetMapping("/eliminar/{id}")
	public String eliminarCategoria(@PathVariable Long id) {
		categoriaService.eliminarCategoria(id);
		return"redirect:/categorias/index";
	}
	@GetMapping("/crear")
	public String crear(Categoria categoria, Model model) {
		List<Categoria> listar = categoriaService.listarCategoria(); 
		model.addAttribute("categorias", listar);
		return "categorias/formCategorias";	
	}
	@PostMapping("/guardar")
	public String guardarCategoria(Categoria categoria) {
		categoriaService.guardarCategoria(categoria);
		return "redirect:/categorias/index";	
	}
	@GetMapping("/buscar/{id}")
	public String buscarCategoria(@PathVariable Long id, Model model) {
		Categoria categoria = categoriaService.buscarCategoria(id);
		model.addAttribute("categoria", categoria);
		return "categorias/formCategorias";
	}
}
