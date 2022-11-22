package co.edu.ucentral.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ucentral.modelo.Estado;

	public interface EstadoRepository extends JpaRepository<Estado, Long> {
}
