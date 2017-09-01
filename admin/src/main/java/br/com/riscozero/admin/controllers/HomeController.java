package br.com.riscozero.admin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by laerteguedes on 31/08/17.
 */
@Controller
public class HomeController {

    @GetMapping("/home")
    public ModelAndView index(ModelAndView mv){
        mv.setViewName("home");

        return mv;
    }

}
