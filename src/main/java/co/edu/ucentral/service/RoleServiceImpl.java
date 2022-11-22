package co.edu.ucentral.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ucentral.modelo.Roles;
import co.edu.ucentral.repository.RoleRepository;


@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public List<Roles> listarRole() {
		return roleRepository.findAll();
	}

	@Override
	public void guardarRole(Roles role) {
		roleRepository.save(role);
	}

	@Override
	public Roles buscarRole(Long id) {
		Optional<Roles> optional = roleRepository.findById(id);
		if (optional.isPresent())
			return optional.get();
		return null;
	}

	@Override
	public void eliminarRole(Long id) {
		roleRepository.deleteById(id);
	}
}
