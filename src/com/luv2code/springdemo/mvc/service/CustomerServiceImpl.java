package com.luv2code.springdemo.mvc.service;

import com.luv2code.springdemo.mvc.dao.CustomerDAO;
import com.luv2code.springdemo.mvc.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CustomerServiceImpl implements CustomerService {

    // Need to inject Customer DAO
    @Autowired
    private CustomerDAO customerDAO;

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        return customerDAO.getCustomers();
    }
}
