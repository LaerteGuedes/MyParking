package br.com.myparking.core.services;

import br.com.myparking.core.model.Permission;
import br.com.myparking.core.repositories.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * @author laerteguedes
 *         26/11/17
 */
@Service
public class PermissionServiceImpl extends BaseServiceImpl<Permission> implements PermissionService {

    @Autowired
    private PermissionRepository permissionRepository;

    @Override
    public JpaRepository getRepository() {
        return permissionRepository;
    }
}
