package com.luisfelipedejesusm.finalexam;

import com.github.javafaker.Faker;
import com.luisfelipedejesusm.finalexam.app.AccountModel;
import com.luisfelipedejesusm.finalexam.app.AccountRepository;
import com.luisfelipedejesusm.finalexam.app.AccountType;
import com.luisfelipedejesusm.finalexam.app.CustomerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class DemoData implements ApplicationRunner {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Faker faker = new Faker();

//        customerRepository.deleteAll();
//        accountRepository.deleteAll();

        for(int i = 0; i < 10; i++){
            AccountModel account = new AccountModel();
            account.setAccountNumber(faker.idNumber().ssnValid());
            account.setAccountType(AccountType.values()[new Random().nextInt(AccountType.values().length)]);
            account.setBalance(faker.number().randomDouble(2, 0, 100000));
            account.setDateOpened(faker.date().birthday());

            CustomerModel customer = new CustomerModel();
            customer.setAccount(account);
            customer.setFirstName(faker.name().firstName());
            customer.setLastName(faker.name().lastName());

//            accountRepository.save(account);
//            customerRepository.save(customer);
        }
    }
}
