package br.com.myparking.core.services;

import br.com.myparking.core.model.Role;
import br.com.myparking.core.model.User;
import br.com.myparking.core.repositories.RoleRepository;
import br.com.myparking.core.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

/**
 * Created by laerteguedes on 30/08/17.
 */
@Service("userService")
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder bCryptPasswordEncoder;

    @Override
    public JpaRepository getRepository() {
        return userRepository;
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void insert(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(true);

        super.insert(user);
    }

}
