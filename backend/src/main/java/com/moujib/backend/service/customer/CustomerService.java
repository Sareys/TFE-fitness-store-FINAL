package com.moujib.backend.service.customer;

import com.moujib.backend.model.customer.Customer;
import com.moujib.backend.model.purchase.Cart;

import java.util.List;

public interface CustomerService {

    Customer getCustomerById(int id);

    void createCustomer(Customer customer);

    Customer getCustomerByUsername(String username);

    void update (Customer customer);

    List<Customer> getAllCustomers();

    List<Customer> getAllCustomersTest();

    void deleteCustomer(Customer customer);

}
