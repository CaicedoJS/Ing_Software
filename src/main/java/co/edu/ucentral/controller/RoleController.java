package co.edu.ucentral.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.edu.ucentral.modelo.Roles;
import co.edu.ucentral.service.RoleService;

@Controller
@RequestMapping(value = "/roles")

public class RoleController {
	@Autowired
	private RoleService roleService;

	@GetMapping("/index")
	public String listar(Model model) {
		List<Roles> listar = roleService.listarRole();
		model.addAttribute("roles", listar);
		return ("roles/index");
	}
	@GetMapping("/eliminar/{id}")
	public String eliminarRole(@PathVariable Long id) {
		roleService.eliminarRole(id);
		return"redirect:/roles/index";
	}
	@GetMapping("/crear")
	public String crear(Roles role, Model model) {
		List<Roles> listar = roleService.listarRole(); 
		model.addAttribute("role", listar);
		return "roles/formRoles";	
	}
	@PostMapping("/guardar")
	public String guardarRole(Roles role) {
		roleService.guardarRole(role);
		return "redirect:/roles/index";	
	}
	@GetMapping("/buscar/{id}")
	public String buscarRole(@PathVariable Long id, Model model) {
		Roles role = roleService.buscarRole(id);
		model.addAttribute("roles", role);
		return "roles/formRoles";
	}
}
