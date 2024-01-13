package br.guedes.gestor.controllers;

import br.guedes.gestor.models.User;
import br.guedes.gestor.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    UserService userService;

    @PostMapping
    public ResponseEntity<?> checkLogin(@RequestBody Map<String, String> credencials) {
        String email = credencials.get("email");
        String password = credencials.get("password");
        System.out.println("Email: %s | Password: %s".formatted(email, password));
        if (email.equals("admin@admin.com") && password.equals("admin")) {
            System.out.println("Administrator Login Accepted");
            return ResponseEntity.ok().body("Administrator Login Accepted");
        }

        User user = userService.findByEmail(email);
        if (user == null) {
            System.out.println("User Not Found");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User: " + email + " | Not Found");
        }
        if (user.getPasswordUser().equals(password)) {
            System.out.println("Login Accepted");
            return ResponseEntity.ok().body("Login Accepted");
        } else {
            System.out.println("Login or Password Incorrect");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login or Password Incorrect");
        }
    }
}
