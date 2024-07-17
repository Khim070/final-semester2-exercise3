package com.example.finalsemester2exercise3.api.controllers;

import com.example.finalsemester2exercise3.Services.CustomerService;
import com.example.finalsemester2exercise3.api.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerControllers {

    private CustomerService customerService;

    @Autowired
    public CustomerControllers(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomer(){
        return customerService.findAll();
    }

    @GetMapping("/customers/{id}")
    public Customer getById(@PathVariable int id){
        return customerService.findById(id);
    }

    @PostMapping("/customers")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }

    @PutMapping("/customers/{id}")
    public Customer updateCustomer(@PathVariable int id, @RequestBody Customer customer){
        return customerService.updateCustomer(id, customer);
    }
}
