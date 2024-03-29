package com.luv2code.springdemo.mvc.service;


import com.luv2code.springdemo.mvc.entity.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getCustomers();
    public List<Customer> getSortedCustomers();
    public void saveCustomer(Customer theCustomer);
    public Customer getCustomer(int id);
    public void deleteCustomer(int id);
    public List<Customer> searchCustomers(String name);
}
