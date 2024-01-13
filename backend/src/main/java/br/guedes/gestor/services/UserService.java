package br.guedes.gestor.services;

import br.guedes.gestor.models.User;
import br.guedes.gestor.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null);
    }

    public User findByEmail(String emailUser) {
        Optional<User> user = userRepository.findByemailUser(emailUser);
        return user.orElse(null);
    }

    public User createUser(User user) {
        userRepository.save(user);
        return user;
    }

    public User updateUser(Long id, User user) {
        User newUser = findById(id);
        if (user.getFirstnameUser() != null) {
            newUser.setFirstnameUser(user.getFirstnameUser());
        }
        if (user.getLastnameUser() != null) {
            newUser.setLastnameUser(user.getLastnameUser());
        }
        if (user.getEmailUser() != null) {
            newUser.setEmailUser(user.getEmailUser());
        }
        if (user.getPhoneUser() != null) {
            newUser.setPhoneUser(user.getPhoneUser());
        }
        return newUser;
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}
