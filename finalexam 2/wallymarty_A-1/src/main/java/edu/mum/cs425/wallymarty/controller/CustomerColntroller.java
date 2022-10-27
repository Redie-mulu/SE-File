package edu.mum.cs425.wallymarty.controller;

import edu.mum.cs425.wallymarty.model.Customer;
import edu.mum.cs425.wallymarty.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.awt.image.AreaAveragingScaleFilter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/walmart")
public class CustomerColntroller {
    public List<Customer> customers2 = new ArrayList<>();

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/")
    public String displayHomepage() {
        return "home2";
    }

    @GetMapping(value = "/newCustomer")
    public String displayCustoemrRegitrationPage(Model model) {
        model.addAttribute("customer", new Customer());
        return "addCustomer";
    }


    @PostMapping(value = "/saveCustomer")
    public  String  addNewCustmer(@Valid @ModelAttribute("customer") Customer customer){
        customerService.addNewCustomer(customer);
        return  "redirect:/customer/list";
    }

//    @PostMapping(value = "/saveCustomer")
//    public String addNewCustmer(@Valid @ModelAttribute("customer") Customer customer) {
//        customerService.addNewCustomer(customer);
//        List<Customer> customer1 = customerService.findCustomerByCoutryandDateOfBirthGreaterThan(customer.getDateOfBirth());
//
////       int x=  (int)(LocalDate.now().getYear()-customer.getDateOfBirth().);
//
//        System.out.println("\nThis is mukaera NUmber #2");
//        for (Customer cust : customer1) {
//            System.out.println(cust.toString());
//        }
//        return customer1.get(0).toString();
//    }

    @GetMapping(value = "/formforsearching")
    public String displayPaprametertoFindPCustomer(Model model) {
        model.addAttribute("customer", new Customer());
        return "findCustomer";
    }
//    @PostMapping (value = "/search")
//    public  String  SearchNewCustmer( Model model){
//        List<Customer> customers= customerService.findCustomerByCoutryandDateOfBirthGreaterThan(customer.getCoutry(), customer.getDateOfBirth());
//        model.addAttribute("customers", customers);
//        return  "customerlist";
//    }


    @PostMapping(value = "/saveEditedCustomer")
    public String asaveEdittedCustommer(@Valid @ModelAttribute("customer") Customer customer) {
        customerService.addNewCustomer(customer);
        return "redirect:/customer/list";
    }
    //


    @GetMapping(value = "/deletecust/{customerId}")
    public String deleteCustmer(@PathVariable Long customerId) {
        customerService.deletById(customerId);
        return "redirect:/customer/list";
    }


    @GetMapping(value = "/editcust/{customerId}")
    public String edit(@PathVariable long customerId, Model model) {
        Customer customer = customerService.findCustmerById(customerId);
        model.addAttribute("customer", customer);
        return "editCustomer";
    }

    @GetMapping(value = "/customer/list")
    public String displayAllCutomer(Model model) {
        List<Customer> customers = customerService.listAll();
        model.addAttribute("customers", customers);
        return "customerList";
    }

    ///


    @GetMapping(value = "/customer/list2")
    public String displayAllCutomer2(Model model) {
        model.addAttribute("customers", customers2);
        return "customerList";
    }

    @GetMapping(value = "/primeCustomerList")
    public String displayAllPrimeCustomer(Model model) {
        List<Customer> primeCustomers = customerService.listAllPrimeCustmer();
        model.addAttribute("primeCustomers", primeCustomers);
        return "primeCustomerList";
    }
}
