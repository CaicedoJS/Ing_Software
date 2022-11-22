package co.edu.ucentral.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.edu.ucentral.modelo.Persona;
import co.edu.ucentral.modelo.Roles;
import co.edu.ucentral.service.PersonaService;
import co.edu.ucentral.service.RoleService;

@Controller
@RequestMapping(value = "/personas")

public class PersonaController {
	@Autowired
	private PersonaService personaService;
	@Autowired
	private RoleService roleService;

	@GetMapping("/index")
	public String listar(Model model) {
		List<Persona> listar = personaService.listarPersona();
		model.addAttribute("personas", listar);
		return ("personas/index");
	}

	@GetMapping("/crear")
	public String crear(Persona personas, Model model) {
		List<Persona> listar = personaService.listarPersona(); 
		model.addAttribute("personas", listar);
		List<Roles> lista = roleService.listarRole();
		model.addAttribute("roles", lista);
		return "personas/formPersonas";	
	}
	@PostMapping("/guardar")
	public String guardarPersona(@Valid Persona persona,BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "personas/formPersonas";
		}
		personaService.guardarPersona(persona);
		return "redirect:/personas/index";	
	}
	@GetMapping("/buscar/{id}")
	public String buscarPersona(@PathVariable Long id, Model model) {
		Persona persona = personaService.buscarPersona(id);
		model.addAttribute("persona", persona);
		List<Roles> lista = roleService.listarRole();
		model.addAttribute("roles", lista);
		return "personas/formPersonas";
	}
	@GetMapping("/eliminar/{id}")
	public String eliminarPersona(@PathVariable Long id) {
		personaService.eliminarPersona(id);
		return"redirect:/personas/index";
	}
}
