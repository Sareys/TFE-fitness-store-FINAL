package com.moujib.backend.service.customer;

import com.moujib.backend.model.customer.Customer;
import com.moujib.backend.repository.customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer getCustomerById(int id) {
        return customerRepository.getCustomerById(id);
    }

    @Override
    public void createCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerByUsername(String username) {
        return customerRepository.getCustomerByUsername(username);
    }

    @Override
    public void update(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.getAllCustomers();
    }

    @Override
    public List<Customer> getAllCustomersTest() {
        List<Customer> customers = new ArrayList<>();
        Customer customerTest = new Customer();
        customerTest.setName("Kratos");
        customerTest.setBanished(true);
        customers.add(customerTest);
        //repository.findAll().forEach(customers::add);
        return customers;
    }

    @Override
    public void deleteCustomer(Customer customer) {
        customerRepository.delete(customer);
    }
}
