package edu.mum.cs425.wallymarty.model;

import jdk.jfr.DataAmount;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.validation.constraints.Pattern;

@Entity
@Data@Setter@Getter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long customerId;
    @NotNull(message = "please enter correct  Birth date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;
    private String customerNumber;
    private String name;
    private String country;
    @Pattern(regexp = "^[0-9][0-9]{2}-[0-9]{2}-[0-9]{4}$11", message="Telephone Numbers must use numbers in this format: XXX-YY-ZZZZ")
    private int contctPhoneNUmber;


}
