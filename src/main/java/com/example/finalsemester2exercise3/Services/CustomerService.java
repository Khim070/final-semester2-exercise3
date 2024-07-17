package com.example.finalsemester2exercise3.Services;

import com.example.finalsemester2exercise3.api.models.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer addCustomer(Customer customer);
    Customer updateCustomer(int id, Customer customer);
    Customer findById(int id);
}
