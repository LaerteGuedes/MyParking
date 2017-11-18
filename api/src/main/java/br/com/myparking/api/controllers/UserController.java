package br.com.myparking.api.controllers;

import br.com.myparking.core.model.User;
import br.com.myparking.core.services.BaseService;
import br.com.myparking.core.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by laerteguedes on 26/08/17.
 */
@RestController
@RequestMapping("/users")
public class UserController extends BaseController<User>{

    @Autowired
    private UserService userService;

    @Override
    protected BaseService<User, Long> getService() {
        return userService;
    }

}
