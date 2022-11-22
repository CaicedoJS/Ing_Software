package co.edu.ucentral.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.edu.ucentral.modelo.Persona;
import co.edu.ucentral.service.PersonaService;
import co.edu.ucentral.service.RoleService;

@Controller
//@RequestMapping(value = "/")
public class indexController {
	@Autowired
	private PersonaService personaService;
	@Autowired
	private RoleService roleService;

	@GetMapping({"/"})
	public String home(Model model) {		
		return "/index"; //regresar pagina principal
	}
	/*@GetMapping({"/login"})
	public String index(Authentication authentication, HttpSession session, Model model) {	
		String username = authentication.getName();
		if(session.getAttribute("usuario")== null){
			Persona usuario = personaService.findByUsername(username);
			usuario.setContrasena(null);
			session.setAttribute("usuario", usuario);
		}
		return "index";
	}*/
	
	@GetMapping("/signup")
	public String registro(PersonaService personaService, Model model) {
		return "/registro";
	}
	/*@PostMapping("/registrar")
	public String guardarPersona(@Valid Persona persona,BindingResult result, Model model) {
		
		personaService.guardarPersona(persona);
		return "redirect:/in";	
	}*/
}
