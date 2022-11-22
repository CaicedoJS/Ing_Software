package co.edu.ucentral.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ucentral.modelo.Persona;

	public interface PersonaRepository extends JpaRepository<Persona, Long> {
		//public Persona findByUsername(String username);
}
