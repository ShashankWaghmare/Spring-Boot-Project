package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Account;

public interface Jparepository extends JpaRepository<Account,Long> {

}
