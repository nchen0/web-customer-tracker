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

    @Override
    public List<Customer> getSortedCustomers() {
        Session currentSession = sessionFactory.getCurrentSession();
        Query<Customer> theQuery = currentSession.createQuery("from Customer order by lastName", Customer.class);
        List<Customer> customers = theQuery.getResultList();
        return customers;
    }

    @Override
    public void saveCustomer(Customer theCustomer) {
        // Get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // Save customer
        currentSession.saveOrUpdate(theCustomer);

        // In the hibernate API, there is session.save, and a session.update.

    }

    @Override
    public Customer getCustomer(int theId) {
        Session currentSession = sessionFactory.getCurrentSession();
        Customer theCustomer = currentSession.get(Customer.class, theId);
        return theCustomer;
    }

    @Override
    public void deleteCustomer(int id) {
        Session currentSession = sessionFactory.getCurrentSession();
        Customer theCustomer = currentSession.get(Customer.class, id);
        currentSession.delete(theCustomer);
    }
}
