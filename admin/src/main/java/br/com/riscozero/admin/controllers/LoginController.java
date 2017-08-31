package br.com.riscozero.admin.controllers;

import br.com.riscozero.core.model.User;
import br.com.riscozero.core.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * Created by laerteguedes on 30/08/17.
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;


    @GetMapping("/login")
    public ModelAndView login(ModelAndView mv){
        mv.setViewName("login");
        return mv;
    }

    @GetMapping("/registration")
    public ModelAndView registration(ModelAndView mv){
        User user = new User();
        mv.addObject("user", user);
        mv.setViewName("registration");

        return mv;
    }

    @PostMapping("/registration")
    public ModelAndView save(@Valid User user, BindingResult bindingResult, ModelAndView mv){

        if (userExists(user.getEmail()))
            bindingResult.rejectValue("email", "error.user", "Email ja cadastrado");

        if (bindingResult.hasErrors()){
            mv.setViewName("registration");
        }else{
            userService.save(user);
            mv.addObject("successMessage", "Usuario cadastrado com sucesso!");
            mv.addObject("user", new User());
            mv.setViewName("registration");
        }

        return mv;
    }

    private boolean userExists(String email){
        User user = userService.findByEmail(email);

        return user != null;
    }

}
