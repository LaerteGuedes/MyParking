package br.com.myparking.api.controllers;

import br.com.myparking.core.factories.ResponseEntityFactory;
import br.com.myparking.core.model.User;
import br.com.myparking.core.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by laerteguedes on 26/08/17.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public ResponseEntity<List<User>> index(){
        List<User> users = userService.findAll();

        return ResponseEntityFactory.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> details(@PathVariable("id") Long id){
        User user = userService.find(id);

        return ResponseEntityFactory.ok(user);
    }

    @PostMapping("/")
    public ResponseEntity insert(@RequestBody @Valid User user){
        userService.insert(user);

        return ResponseEntityFactory.create(user);
    }

    @PutMapping("/")
    public ResponseEntity update(@RequestBody @Valid User user){
        userService.update(user);

        return ResponseEntityFactory.create(user);
    }

    public ResponseEntity delete(Long id){
        userService.delete(id);

        return ResponseEntityFactory.create(new Object());
    }

}
