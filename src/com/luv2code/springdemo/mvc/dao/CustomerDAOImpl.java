package com.luv2code.springdemo.mvc.dao;

import com.luv2code.springdemo.mvc.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository // Need spring to be able to find it.
public class CustomerDAOImpl implements CustomerDAO {

    // need to inject the session factory
    @Autowired // This takes from the bean with the session factory, Spring finds it in the scan and defines it here for us.
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        // Get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // Create a query
        Query<Customer> theQuery = currentSession.createQuery("from Customer", Customer.class);

        // Execute query and get result list
        List<Customer> customers = theQuery.getResultList();

        // Return the results
        return customers;
    }
}