package com.luisfelipedejesusm.finalexam.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/account")
public class RESTController {

    @Autowired
    private AccountRepository repository;

    @GetMapping("/list")
    public List<AccountDto> accountModelList(){
        return repository.findAll().stream().map(AccountDto::new).toList();
    }

    @GetMapping("/prime/list")
    public List<AccountDto> accountModelPrimeList(){
        return repository.findAllByBalanceGreaterThanEqual(10_000.0).stream().map(AccountDto::new).toList();
    }
}
