package br.guedes.gestor.repositories;

import br.guedes.gestor.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByemailUser(String emailUser);
}
