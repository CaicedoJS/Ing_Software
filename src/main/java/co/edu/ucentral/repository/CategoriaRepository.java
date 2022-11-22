package co.edu.ucentral.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ucentral.modelo.Categoria;

	public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
