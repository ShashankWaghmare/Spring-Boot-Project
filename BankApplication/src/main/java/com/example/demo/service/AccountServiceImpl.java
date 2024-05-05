package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Account;
import com.example.demo.repo.Jparepository;
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
	Jparepository repo;
	@Override
	public Account createAccount(Account account) {
		repo.save(account);
		return account;
	}

	@Override
	public Account getAccountDetailsByAccountNumber(Long AccountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> getAllAccountDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account depositAmount(Long accountNumber, Double money) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account withdrawAmount(Long accountNumber, Double money) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void closeAccount(Long accountNumber) {
		// TODO Auto-generated method stub
		
	}

}
