package br.com.edvaldooliveira.springsecurity.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.edvaldooliveira.springsecurity.models.ERole;
import br.com.edvaldooliveira.springsecurity.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(ERole name);
}