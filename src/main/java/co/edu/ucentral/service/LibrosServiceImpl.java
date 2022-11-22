package co.edu.ucentral.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ucentral.modelo.Libros;
import co.edu.ucentral.repository.LibrosRepository;


@Service
public class LibrosServiceImpl implements LibrosService {

	@Autowired
	private LibrosRepository librosRepository;

	@Override
	public List<Libros> listarLibros() {
		return librosRepository.findAll();
	}

	@Override
	public void guardarLibros(Libros libros) {
		librosRepository.save(libros);
	}

	@Override
	public Libros buscarLibros(Long id) {
		Optional<Libros> optional = librosRepository.findById(id);
		if (optional.isPresent())
			return optional.get();
		return null;
	}

	@Override
	public void eliminarLibros(Long id) {
		librosRepository.deleteById(id);
	}
}
