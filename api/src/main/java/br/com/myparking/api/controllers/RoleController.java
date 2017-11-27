package br.com.myparking.api.controllers;

import br.com.myparking.core.model.Role;
import br.com.myparking.core.services.BaseService;
import br.com.myparking.core.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author laerteguedes
 *         26/11/17
 */
@RestController
@RequestMapping("/roles")
public class RoleController extends BaseController<Role>{

    @Autowired
    private RoleService roleService;

    @Override
    protected BaseService<Role, Long> getService() {
        return roleService;
    }
}
