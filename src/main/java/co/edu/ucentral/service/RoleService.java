package co.edu.ucentral.service;

import java.util.List;

import co.edu.ucentral.modelo.Roles;


	public interface RoleService {
		
		public List<Roles> listarRole();

		public void guardarRole(Roles role);

		public Roles buscarRole(Long id);

		public void eliminarRole(Long id);
	}

