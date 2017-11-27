package br.com.myparking.core.services;

import br.com.myparking.core.model.Role;
import br.com.myparking.core.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * @author laerteguedes
 *         26/11/17
 */
@Service
public class RoleServiceImpl extends BaseServiceImpl<Role> implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public JpaRepository getRepository() {
        return roleRepository;
    }
}
