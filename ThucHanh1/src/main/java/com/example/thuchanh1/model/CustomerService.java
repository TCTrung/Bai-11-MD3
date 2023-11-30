package com.example.thuchanh1.model;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    void save(Customer customer);
    Customer findById(int id);
    void remove(int id);
    void update(int id,Customer customer);

}
