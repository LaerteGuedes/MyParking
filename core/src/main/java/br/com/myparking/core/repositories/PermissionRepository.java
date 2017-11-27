package br.com.myparking.core.repositories;

import br.com.myparking.core.model.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author laerteguedes
 *         26/11/17
 */
@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long>{
}
