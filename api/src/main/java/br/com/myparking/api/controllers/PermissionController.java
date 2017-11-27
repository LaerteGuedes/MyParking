package br.com.myparking.api.controllers;

import br.com.myparking.core.model.Permission;
import br.com.myparking.core.services.BaseService;
import br.com.myparking.core.services.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author laerteguedes
 *         26/11/17
 */
@RestController
@RequestMapping("/permissions")
public class PermissionController extends BaseController<Permission> {

    @Autowired
    private PermissionService permissionService;

    @Override
    protected BaseService<Permission, Long> getService() {
        return permissionService;
    }
}
