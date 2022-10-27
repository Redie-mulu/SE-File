package com.luisfelipedejesusm.finalexam.app;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name = "accounts")
public class AccountModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    @NotBlank
    private String accountNumber;

    @NotNull
    private AccountType accountType;

    private Date dateOpened; // I could Use local date but because faker I will use old Date class

    @NotNull
    private Double balance = 0.0;

    @OneToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private CustomerModel customer;

}
