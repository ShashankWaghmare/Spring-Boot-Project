package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long account_number;
	
	@Column
   private String account_holder_name;
	@Column
   private double account_balance;
	public Long getAccount_number() {
		return account_number;
	}
	public void setAccount_number(Long account_number) {
		this.account_number = account_number;
	}
	public String getAccount_holder_name() {
		return account_holder_name;
	}
	public void setAccount_holder_name(String account_holder_name) {
		this.account_holder_name = account_holder_name;
	}
	public double getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(double account_balance) {
		this.account_balance = account_balance;
	}
	public Account(String account_holder_name, double account_balance) {
		super();
		this.account_holder_name = account_holder_name;
		this.account_balance = account_balance;
	}
	@Override
	public String toString() {
		return "Account [account_number=" + account_number + ", account_holder_name=" + account_holder_name
				+ ", account_balance=" + account_balance + "]";
	}
	public Account() {
//		TODO Auto-Generated constructor stub
	}
	
}
