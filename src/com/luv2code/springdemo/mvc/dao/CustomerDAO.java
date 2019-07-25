package com.luv2code.springdemo.mvc.dao;

import com.luv2code.springdemo.mvc.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    public List<Customer> getCustomers();
    public void saveCustomer(Customer theCustomer);
    public List<Customer> getSortedCustomers();
    public Customer getCustomer(int id);
    public void deleteCustomer(int id);
    public List<Customer> searchCustomers(String name);
}
