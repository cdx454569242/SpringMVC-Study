package project.service;

import project.domain.Account;

import java.util.List;


public interface AccountService {
    public List<Account> findAll();

    public void saveAccount(Account account);
}
