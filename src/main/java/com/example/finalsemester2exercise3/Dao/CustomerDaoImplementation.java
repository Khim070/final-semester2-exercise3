package com.example.finalsemester2exercise3.Dao;

import com.example.finalsemester2exercise3.api.models.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDaoImplementation implements CustomerDao{
    private EntityManager entityManager;

    @Autowired
    public CustomerDaoImplementation(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public List<Customer> findAll() {
        TypedQuery<Customer> query = entityManager.createQuery("SELECT c FROM Customer c", Customer.class);
        List<Customer> result  = query.getResultList();
        return result;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        Customer result = entityManager.merge(customer);
        return result;
    }

    @Override
    public Customer findById(int id) {
        Customer result = entityManager.find(Customer.class, id);
        return result;
    }
}
