package com.luisfelipedejesusm.finalexam.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private AccountService service;

    @GetMapping(value = {"/", "/index"})
    public String index(){
        return "index";
    }

    @GetMapping("/accounts")
    public String showAllAccounts(Model model){
        List<AccountModel> accounts = service.getAllAccounts();
        model.addAttribute("accounts", accounts);
        model.addAttribute("total", accounts.stream().mapToDouble(AccountModel::getBalance).sum());
        return "accounts";
    }
}
