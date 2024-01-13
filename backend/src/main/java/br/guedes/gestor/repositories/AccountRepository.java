package br.guedes.gestor.repositories;

import br.guedes.gestor.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
