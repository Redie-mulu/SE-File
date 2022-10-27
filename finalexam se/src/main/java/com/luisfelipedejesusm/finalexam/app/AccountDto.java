package com.luisfelipedejesusm.finalexam.app;

import lombok.Getter;

import java.time.LocalDate;
import java.util.Date;

@Getter
public class AccountDto {
    private Long accountId;
    private String accountNumber;
    private String accountType;
    private Double balance;
    private Date openDate;
    private CustomerDto customer;

    public AccountDto(AccountModel accountModel){
        accountId = accountModel.getId();
        accountNumber = accountModel.getAccountNumber();
        accountType = accountModel.getAccountType().getName();
        balance = accountModel.getBalance();
        openDate = accountModel.getDateOpened();
        customer = new CustomerDto(accountModel.getCustomer());

    }
}
