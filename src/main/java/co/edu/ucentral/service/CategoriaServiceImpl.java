package co.edu.ucentral.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.edu.ucentral.modelo.Categoria;
import co.edu.ucentral.repository.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Override
	public List<Categoria> listarCategoria() {
		return categoriaRepository.findAll();
	}

	@Override
	public void guardarCategoria(Categoria categoria) {
		categoriaRepository.save(categoria);
	}

	@Override
	public Categoria buscarCategoria(Long id) {
		Optional<Categoria> optional = categoriaRepository.findById(id);
		if (optional.isPresent())
			return optional.get();
		return null;
	}

	@Override
	public void eliminarCategoria(Long id) {
		categoriaRepository.deleteById(id);
	}

}
