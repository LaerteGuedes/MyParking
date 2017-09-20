package br.com.myparking.core.services;

import br.com.myparking.core.model.Role;
import br.com.myparking.core.model.User;
import br.com.myparking.core.repositories.RoleRepository;
import br.com.myparking.core.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

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
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public JpaRepository getRepository() {
        return userRepository;
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(true);

        userRepository.save(user);
    }

    @Override
    public void saveAdmin(User user) {
        Role adminRole = roleRepository.findByName("ADMIN");
        user.setRoles(new HashSet<>(Arrays.asList(adminRole)));

        save(user);
    }
}
