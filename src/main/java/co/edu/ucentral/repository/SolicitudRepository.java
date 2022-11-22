package co.edu.ucentral.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ucentral.modelo.Solicitud;

	public interface SolicitudRepository extends JpaRepository<Solicitud, Long> {
		

		
}
