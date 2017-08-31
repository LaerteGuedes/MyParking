package br.com.riscozero.core.services;

import br.com.riscozero.core.model.User;

import java.util.List;

/**
 * Created by laerteguedes on 30/08/17.
 */
public interface UserService {

    List<User> findAll();
    User find(Long id);
    User findByEmail(String email);
    void save(User user);
    void saveAdmin(User user);
    void delete(Long id);

}
