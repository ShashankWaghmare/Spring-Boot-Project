package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Account;

public interface AccountService {
          public Account createAccount(Account account);
          public Account getAccountDetailsByAccountNumber(Long AccountNumber);
          public List<Account> getAllAccountDetails();
          public Account depositAmount(Long accountNumber,Double money);
          public Account withdrawAmount(Long accountNumber,Double money);
          public void closeAccount(Long accountNumber);
          
}
