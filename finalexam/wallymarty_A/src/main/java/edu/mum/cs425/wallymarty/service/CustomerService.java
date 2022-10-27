package edu.mum.cs425.wallymarty.service;

import edu.mum.cs425.wallymarty.model.Customer;

import java.util.List;

public interface CustomerService {
     List<Customer> listAll();
     Customer findCustmerById(Long id);
     void deletById(Long id);
     void addNewCustomer(Customer customer);
     List<Customer> listAllPrimeCustmer();
}
