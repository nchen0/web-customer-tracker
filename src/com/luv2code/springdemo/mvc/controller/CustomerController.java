package com.luv2code.springdemo.mvc.controller;

import com.luv2code.springdemo.mvc.dao.CustomerDAO;
import com.luv2code.springdemo.mvc.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerDAO customerDAO;

    @RequestMapping("/list")
    public String listCustomers(Model theModel) {

        // Get Customers from the DAO
        List<Customer> theCustomers = customerDAO.getCustomers();

        // Add the customers to the MVC Model
        theModel.addAttribute("customers", theCustomers);

        return "list-customers";
    }
}
