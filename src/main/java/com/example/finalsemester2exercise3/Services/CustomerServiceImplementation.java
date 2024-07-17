package com.example.finalsemester2exercise3.Services;


import com.example.finalsemester2exercise3.Dao.CustomerDao;
import com.example.finalsemester2exercise3.api.models.Customer;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImplementation implements CustomerService{

    private CustomerDao customerDao;

    @Autowired
    public CustomerServiceImplementation(CustomerDao customerDao){
        this.customerDao = customerDao;
    }

    @Override
    public List<Customer> findAll() {
        return customerDao.findAll();
    }

    @Transactional
    @Override
    public Customer addCustomer(Customer customer) {
        customer.setId(0);
        Customer result = customerDao.saveCustomer(customer);
        return result;
    }

    @Transactional
    @Override
    public Customer updateCustomer(int id, Customer customer) {
        customer.setId(id);
        Customer result = customerDao.saveCustomer(customer);
        return result;
    }

    @Override
    public Customer findById(int id) {
        return customerDao.findById(id);
    }
}
