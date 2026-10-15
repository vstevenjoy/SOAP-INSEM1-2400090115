package com.example.account.service;

import org.springframework.stereotype.Service;
import com.example.account.model.Account;

@Service
public class AccountService {

    public Account getAccount() {
        return new Account(101, "John", "Savings");
    }
}