package co.edu.ucentral.service;

import java.util.List;
import co.edu.ucentral.modelo.Estado;

public interface EstadoService {

	public List<Estado> listarEstado();

	public void guardarEstado(Estado categoria);

	public Estado buscarEstado(Long id);

	public void eliminarEstado(Long id);
}
