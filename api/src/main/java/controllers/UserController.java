package controllers;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repositories.UserRepository;

import java.util.List;

/**
 * Created by laerteguedes on 26/08/17.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    ResponseEntity<List<User>> index(){
        List<User> users = userRepository.findAll();

        return new ResponseEntity<>(users, HttpStatus.OK);
    }

}
