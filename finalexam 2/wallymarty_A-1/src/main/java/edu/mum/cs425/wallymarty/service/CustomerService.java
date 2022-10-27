package edu.mum.cs425.wallymarty.service;

import edu.mum.cs425.wallymarty.model.Customer;
import edu.mum.cs425.wallymarty.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> listAll() {
        return customerRepository.findAll(Sort.by("country","dateOfBirth"));
    }

    public Customer findCustmerById(Long id) {
        return customerRepository.getOne(id);
    }

    public void deletById(Long id) {
        customerRepository.deleteById(id);
    }

    public void addNewCustomer(Customer customer) {

        customerRepository.save(customer);
    }
    public List<Customer> listAllPrimeCustmer() {
        List<Customer> pcus = new ArrayList<>();
        for (Customer p : listAll()) {
            if ( Period.between(p.getDateOfBirth(), LocalDate.now()).getYears() >= 40) {
                pcus.add(p);
            }
        }
        return pcus;
    }















//    public List<Customer> findCustomerByCoutryandDateOfBirthGreaterThan(LocalDate dateOfBirth) {
//
//        return customerRepository.findCustomerByCoutryandDateOfBirthGreaterThan(dateOfBirth);
//    }

//    public HashMap<String, Integer> monthlyEarning() {
//
//        HashMap<String, Integer> hashMap = new HashMap<>();
//        List<Customer> customers = customerRepository.findAll();
//        for (Customer c : customers)
//            if (!hashMap.containsKey(c.getCoutry())) {
//                hashMap.put(c.getCoutry(), 1);
//            } else if (hashMap.get(c.getCoutry()).equals(c.getCoutry())) {
//                int newvalue = (int) hashMap.get(c.getCoutry()) + 1;
//                {
//                    hashMap.put(c.getCoutry(), newvalue);
//                }
//            }
//
//        System.out.println(hashMap.toString());
//        return hashMap;
//
//    }
}
