package co.edu.ucentral.service;

import java.util.List;
import co.edu.ucentral.modelo.Solicitud;

public interface SolicitudService {

	public List<Solicitud> listarSolicitud();

	public void guardarSolicitud(Solicitud solicitud);

	public Solicitud buscarSolicitud(Long id);

	public void eliminarSolicitud(Long id);
}
