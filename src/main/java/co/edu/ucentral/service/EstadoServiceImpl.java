package co.edu.ucentral.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ucentral.modelo.Estado;
import co.edu.ucentral.repository.EstadoRepository;

@Service
public class EstadoServiceImpl implements EstadoService {

	@Autowired
	private EstadoRepository estadoRepository;

	@Override
	public List<Estado> listarEstado() {
		return estadoRepository.findAll();
	}

	@Override
	public void guardarEstado(Estado estado) {
		estadoRepository.save(estado);
	}

	@Override
	public Estado buscarEstado(Long id) {
		Optional<Estado> optional = estadoRepository.findById(id);
		if (optional.isPresent())
			return optional.get();
		return null;
	}

	@Override
	public void eliminarEstado(Long id) {
		estadoRepository.deleteById(id);
	}

}
