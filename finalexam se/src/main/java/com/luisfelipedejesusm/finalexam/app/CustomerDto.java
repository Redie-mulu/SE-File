package com.luisfelipedejesusm.finalexam.app;

import lombok.Getter;

@Getter
public class CustomerDto {
    private Long id;
    private String firstName;
    private String lastName;

    public CustomerDto(CustomerModel customer){
        id = customer.getId();
        firstName = customer.getFirstName();
        lastName = customer.getLastName();
    }
}
