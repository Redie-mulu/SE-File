package com.luisfelipedejesusm.finalexam.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository repository;

    public List<AccountModel> getAllAccounts() {
        return repository.findAllByOrderByBalanceDesc();
    }
}
