package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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
	public Account createAccount(@RequestBody Account account) {
		Account createdAccount=service.createAccount(account);
		return createdAccount;
	}
}
