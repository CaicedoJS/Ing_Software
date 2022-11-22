package co.edu.ucentral.service;

import java.util.List;

import co.edu.ucentral.modelo.Libros;

public interface LibrosService {

	public List<Libros> listarLibros();

	public void guardarLibros(Libros libros);

	public Libros buscarLibros(Long id);

	public void eliminarLibros(Long id);
}
