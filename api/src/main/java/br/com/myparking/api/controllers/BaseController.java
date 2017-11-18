package br.com.myparking.api.controllers;

import br.com.myparking.core.factories.ResponseEntityFactory;
import br.com.myparking.core.model.Model;
import br.com.myparking.core.model.User;
import br.com.myparking.core.services.BaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by laerteguedes on 18/11/17.
 */
public abstract class BaseController<T extends Model> {

    protected abstract BaseService<T, Long> getService();

    @GetMapping("/")
    public ResponseEntity<List<T>> index(){
        List<T> elements = getService().findAll();

        return ResponseEntityFactory.ok(elements);
    }

    @GetMapping("/{id}")
    public ResponseEntity<T> details(@PathVariable("id") Long id){
        T elem = getService().find(id);

        return ResponseEntityFactory.ok(elem);
    }

    @PostMapping("/")
    public ResponseEntity insert(@RequestBody @Valid T t, BindingResult bindingResult){
        if (bindingResult.hasErrors())
            return ResponseEntityFactory.badRequest(bindingResult.getFieldErrors());

        getService().insert(t);

        return ResponseEntityFactory.create(t);
    }

    @PutMapping("/")
    public ResponseEntity update(@RequestBody @Valid T t){
        getService().update(t);

        return ResponseEntityFactory.create(t);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(Long id){
        getService().delete(id);

        return ResponseEntityFactory.create(new Object());
    }



}
