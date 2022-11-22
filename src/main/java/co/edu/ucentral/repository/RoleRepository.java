package co.edu.ucentral.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ucentral.modelo.Roles;

	public interface RoleRepository extends JpaRepository<Roles, Long> {
}
