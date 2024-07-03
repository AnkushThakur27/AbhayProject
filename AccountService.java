package com.nazeem.multidb.mongodb.service;

import com.nazeem.multidb.mongodb.model.Account;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private MongoTemplate customerDbMongoTemplate;

    public List<Account> findAll(){
        return customerDbMongoTemplate.findAll(Account.class);
    }

    public Account findByAccountId(String accountId) {
        return customerDbMongoTemplate.findById(accountId,Account.class);
    }
}
