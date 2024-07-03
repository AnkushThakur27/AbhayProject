package com.nazeem.multidb.mongodb.controller;

import com.nazeem.multidb.mongodb.model.Account;
import com.nazeem.multidb.mongodb.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/findById/{accountId}")
    public Account findById(@PathVariable("accountId") String accountId) {
        return accountService.findByAccountId(accountId);
    }

}
