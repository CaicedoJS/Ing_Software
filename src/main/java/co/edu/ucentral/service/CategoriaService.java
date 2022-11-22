package co.edu.ucentral.service;

import java.util.List;
import co.edu.ucentral.modelo.Categoria;

public interface CategoriaService {

	public List<Categoria> listarCategoria();

	public void guardarCategoria(Categoria categoria);

	public Categoria buscarCategoria(Long id);

	public void eliminarCategoria(Long id);
}
