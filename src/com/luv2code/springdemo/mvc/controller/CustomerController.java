package com.luv2code.springdemo.mvc.controller;

import com.luv2code.springdemo.mvc.entity.Customer;
import com.luv2code.springdemo.mvc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

//    @Autowired
//    private CustomerDAO customerDAO;

    @Autowired
    private CustomerService customerService;

    @GetMapping("/list")
    public String listCustomers(Model theModel) {

        // Get Customers from the DAO
//        List<Customer> theCustomers = customerDAO.getCustomers();
//
//        // Add the customers to the MVC Model
//        theModel.addAttribute("customers", theCustomers);


        // Using CustomerService instead of using customerDAO
        List<Customer> theCustomers = customerService.getCustomers();

        theModel.addAttribute("customers", theCustomers);
        return "list-customers";
    }

    @GetMapping("/list/sorted")
    public String listCustomerSorted(Model theModel) {

        // Using CustomerService instead of using customerDAO
        List<Customer> theCustomers = customerService.getSortedCustomers();

        theModel.addAttribute("customers", theCustomers);
        return "list-customers-sorted";
    }

    @GetMapping("/showAddForm")
    public String showAddForm(Model theModel) {
        Customer theCustomer = new Customer();
        theModel.addAttribute("customer", theCustomer);
        return "customer-form";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {

        // Save the customer using our service
        customerService.saveCustomer(theCustomer);
        return "redirect:/customer/list";
    }


}
