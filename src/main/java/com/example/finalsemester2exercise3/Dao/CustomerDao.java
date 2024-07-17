package com.example.finalsemester2exercise3.Dao;

import com.example.finalsemester2exercise3.api.models.Customer;

import java.util.List;

public interface CustomerDao {
    List<Customer> findAll();
    Customer saveCustomer(Customer customer);
    Customer findById(int id);
}
