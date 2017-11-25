package br.com.myparking.core.services;

import br.com.myparking.core.model.User;

import java.util.List;
import java.util.Optional;

/**
 * Created by laerteguedes on 30/08/17.
 */
public interface UserService extends BaseService<User, Long> {
    User findByEmail(String email);

    Optional<User> findByUsername(String username);
}
