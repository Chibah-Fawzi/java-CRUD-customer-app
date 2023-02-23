package com.fawzi_learn.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fawzi_learn.models.Customer;
import com.fawzi_learn.repository.CustomerRepository;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }
    // record NewCustomer(String name, String email, Integer age) {}
    
    public Customer addCustomer(Customer newCustomer) {

        return customerRepository.save(newCustomer);
    }

}
