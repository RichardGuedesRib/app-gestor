package br.guedes.gestor.controllers;

import br.guedes.gestor.models.User;
import br.guedes.gestor.services.UserService;
import br.guedes.gestor.util.DataValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")

public class UserController {

    @Autowired
    UserService userService;


    @GetMapping
    public ResponseEntity<?> findAll() {
        List<User> users = userService.findAllUsers();
        return ResponseEntity.ok().body(users);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        User user = userService.findById(id);
        if (user != null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID:" + id + "| User Not Found");
        }
        return ResponseEntity.ok().body(user);
    }

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody User user) {
        if (DataValidator.validateString(user.getFirstnameUser()) == false) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("First name is invalid");
        }
        if (DataValidator.validateString(user.getLastnameUser()) == false) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Last name is invalid");
        }
        if (DataValidator.validateString(user.getEmailUser()) == false) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Email is invalid");
        }
        if (DataValidator.validateString(user.getPasswordUser()) == false) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Password is invalid");
        }
        if (DataValidator.validatePhoneNumber(user.getPhoneUser()) == false) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Phone number is invalid");
        }
        User newUser = userService.findByEmail(user.getEmailUser());
        if (newUser != null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("There is already a user with an email address provided");
        }
        newUser = userService.createUser(user);
        return ResponseEntity.ok().body(newUser);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<?> updateUser(@PathVariable Long id, User user) {
        User updateUser = userService.findById(id);
        if (updateUser == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID:" + id + "| User Not Found");
        }
        userService.updateUser(id, user);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("User Updated Successfully");
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteUserById (@PathVariable Long id) {
        User user = userService.findById(id);
        if(user == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID:" + id + "| User Not Found");
        }
        userService.deleteUserById(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("User Deleted Successfully");
    }
}
