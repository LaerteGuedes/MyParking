package br.com.riscozero.admin.controllers;

import br.com.riscozero.core.model.User;
import br.com.riscozero.core.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by laerteguedes on 30/08/17.
 */
@Controller
@RequestMapping("/users")
public class UserController implements CrudController<User>{

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public ModelAndView index(ModelAndView mv) {
        List<User> users = userService.findAll();
        mv.addObject("users", users);
        mv.setViewName("user/index");

        return mv;
    }

    @GetMapping("/add")
    public ModelAndView add(ModelAndView mv) {
        mv.addObject("user", new User());
        mv.setViewName("user/add");

        return mv;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable("id") Long id, ModelAndView mv) {
        User user = userService.find(id);
        mv.addObject("user", user);
        mv.setViewName("user/add");

        return mv;
    }

    @PostMapping("/add")
    public ModelAndView save(@Valid User user, BindingResult bindingResult, RedirectAttributes redirectAttributes, ModelAndView mv) {

        if (bindingResult.hasErrors()){
            mv.setViewName("user/add");
            return mv;
        }

        userService.save(user);
        redirectAttributes.addFlashAttribute("successMessage", "Usuário cadastrado com sucesso!");

        return new ModelAndView("redirect:/users/");
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") Long id, RedirectAttributes redirectAttributes) {
        userService.delete(id);

        redirectAttributes.addFlashAttribute("successMessage", "Usuário excluido com sucesso!");

        return new ModelAndView("redirect:/users/");
    }
}
