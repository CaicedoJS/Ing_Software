package co.edu.ucentral.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.edu.ucentral.modelo.Libros;
	@Repository
	public interface LibrosRepository extends JpaRepository<Libros, Long> {
		
		/*@Query(value = "update libros SET disponibilidad=? - 1 where libros.id_libro=?")
		Collection<Libros> solicitarLibro();*/ 
}
