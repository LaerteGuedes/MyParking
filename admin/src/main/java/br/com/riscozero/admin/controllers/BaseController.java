package br.com.riscozero.admin.controllers;

import com.sun.javafx.sg.prism.NGShape;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

/**
 * Created by laerteguedes on 02/09/17.
 */
public interface BaseController<T> {

    ModelAndView index(ModelAndView mv);
    ModelAndView add(ModelAndView mv);
    ModelAndView edit(Long id,ModelAndView mv);
    ModelAndView save(T t, BindingResult bindingResult, RedirectAttributes redirectAttributes, ModelAndView mv);
    ModelAndView delete(Long id,  RedirectAttributes redirectAttributes);

}
