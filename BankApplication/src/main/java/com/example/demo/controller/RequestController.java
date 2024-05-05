package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Account;
import com.example.demo.service.AccountService;

@RestController
@RequestMapping("/account")
public class RequestController {
           
	@Autowired
	AccountService service;
	
	
	@PostMapping("/create")
	public ResponseEntity<Account> createAccount(@RequestBody Account account) {
		Account createdAccount=service.createAccount(account);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(createdAccount);
	}
	@GetMapping("/alldetails")
	public List<Account> getAllaccountdetails() {
		List<Account> account=service.getAllAccountDetails();
		return account;
	}
	
	@GetMapping("/getdetails/{accountNumber}")
		public Account getAccountDetails(@PathVariable Long accountNumber) {
		Account detailed=service.getAccountDetailsByAccountNumber(accountNumber);
		return detailed;
	}
	@PutMapping("/withdrawAmount/{accountNumber}/{amount}")
	   public Account withdrawAmount(@PathVariable Long accountNumber,@PathVariable Double amount) {
		Account withdrawn_account=service.withdrawAmount(accountNumber, amount);
		return withdrawn_account;
	}
}
