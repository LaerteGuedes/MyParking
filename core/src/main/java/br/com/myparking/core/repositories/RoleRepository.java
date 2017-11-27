package br.com.myparking.core.repositories;

import br.com.myparking.core.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by laerteguedes on 30/08/17.
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
    Role findByName(String name);
}
