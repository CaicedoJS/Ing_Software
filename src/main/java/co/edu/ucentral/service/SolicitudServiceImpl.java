
package co.edu.ucentral.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.edu.ucentral.modelo.Solicitud;
import co.edu.ucentral.repository.SolicitudRepository;

@Service
public class SolicitudServiceImpl implements SolicitudService {

	@Autowired
	private SolicitudRepository solicitudRepository;

	@Override
	public List<Solicitud> listarSolicitud() {
		return solicitudRepository.findAll();
	}

	@Override
	public void guardarSolicitud(Solicitud solicitud) {
		solicitudRepository.save(solicitud);
	}

	@Override
	public Solicitud buscarSolicitud(Long id) {
		Optional<Solicitud> optional = solicitudRepository.findById(id);
		if (optional.isPresent())
			return optional.get();
		return null;
	}

	@Override
	public void eliminarSolicitud(Long id) {
		solicitudRepository.deleteById(id);
	}

}
