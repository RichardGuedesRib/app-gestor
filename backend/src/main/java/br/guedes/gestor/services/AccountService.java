package br.guedes.gestor.services;

import br.guedes.gestor.models.Account;
import br.guedes.gestor.models.User;
import br.guedes.gestor.repositories.AccountRepository;
import br.guedes.gestor.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public List<Account> findAllAccounts() {
        return accountRepository.findAll();
    }

    public Account findById(Long id) {
        Optional<Account> account = accountRepository.findById(id);
        return account.orElse(null);
    }


    public Account createAccount(Account account) {
        accountRepository.save(account);
        return account;
    }

    public Account updateUser(Long id, Account account) {
        Account newAccount = findById(id);
        if (account.getAccountDescription() != null) {
            newAccount.setAccountDescription(account.getAccountDescription());
        }
        if (account.getAccountType() != null) {
            newAccount.setAccountType(account.getAccountType());
        }
        if (account.getOpenDate() != null) {
            newAccount.setOpenDate(account.getOpenDate());
        }
        if (account.getIsActive() != null) {
            newAccount.setIsActive(account.getIsActive());
        }
        if (account.getUser() != null) {
            newAccount.setUser(account.getUser());
        }
        return newAccount;
    }

    public void deleteAccountById(Long id) {
        accountRepository.deleteById(id);
    }
}
