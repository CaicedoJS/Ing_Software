package co.edu.ucentral.service;

import java.util.List;

import co.edu.ucentral.modelo.Persona;

public interface PersonaService {

	public List<Persona> listarPersona();

	public void guardarPersona(Persona persona);

	public Persona buscarPersona(Long id);

	public void eliminarPersona(Long id);
	
	//public Persona findByUsername(String username);
}
