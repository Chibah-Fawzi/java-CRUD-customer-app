package com.fawzi_learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fawzi_learn.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}

