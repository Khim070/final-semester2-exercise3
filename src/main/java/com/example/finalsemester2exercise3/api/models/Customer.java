package com.example.finalsemester2exercise3.api.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tbcustomer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int id;
    @Column(name = "customer_last_name")
    private String last_name;
    @Column(name = "customer_first_name")
    private String first_name;
    @Column(name = "customer_phone")
    private String phone;

    public Customer(){

    }

    public Customer(String last_name, String first_name, String phone) {
        this.last_name = last_name;
        this.first_name = first_name;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
