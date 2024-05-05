package com.example.demo.service;

import java.util.List;
import java.util.Optional;

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
		Optional<Account> act_details=repo.findById(AccountNumber);
		if(act_details.isEmpty()) {
			throw new RuntimeException("Account is not present");
		}
		Account selectedaccount=act_details.get();
		return selectedaccount;
	}

	@Override
	public List<Account> getAllAccountDetails() {
		List<Account> details=repo.findAll();
		return details;
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
