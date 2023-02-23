package com.fawzi_learn.controllers;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fawzi_learn.models.Customer;
import com.fawzi_learn.services.CustomerService;


@RestController
@RequestMapping("api/v1/customers")


public class CustomerController {
    @Autowired    
    private CustomerService customerService; 

	@GetMapping
    public List<Customer> getCustomers() {
    	return customerService.getCustomers();
    }
	
	@PostMapping
    public Customer addCustomer(@RequestBody Customer newCustomer) {
    	return customerService.addCustomer(newCustomer);
        
    }
}
