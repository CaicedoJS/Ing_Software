package co.edu.ucentral.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ucentral.modelo.Persona;
import co.edu.ucentral.repository.PersonaRepository;


@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaRepository personaRepository;

	@Override
	public List<Persona> listarPersona() {
		return personaRepository.findAll();
	}

	@Override
	public void guardarPersona(Persona persona) {
		personaRepository.save(persona);
	}

	@Override
	public Persona buscarPersona(Long id) {
		Optional<Persona> optional = personaRepository.findById(id);
		if (optional.isPresent())
			return optional.get();
		return null;
	}

	@Override
	public void eliminarPersona(Long id) {
		personaRepository.deleteById(id);
	}

	/*@Override
	public Persona findByUsername(String username) {
		return personaRepository.findByUsername(username);
	}*/

}
