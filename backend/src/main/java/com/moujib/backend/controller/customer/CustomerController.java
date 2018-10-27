package com.moujib.backend.controller.customer;

import com.moujib.backend.model.customer.Customer;
import com.moujib.backend.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    //TODO: Move everything under to admin controllers

    @GetMapping("/getAllCustomers")
    public List<Customer> getAllCustomersTest() {
        System.out.println("Get all Customers...");
        return customerService.getAllCustomersTest();
    }

    @GetMapping(value="/allCustomers")
    public List<Customer> getAllCustomersTemp(){
        Customer customer1 = new Customer();
        customer1.setCustomerId(1);
        customer1.setUsername("Sareys");
        customer1.setCustomerEmail("sareys@smals.be");
        customer1.setName("Moujib");
        customer1.setLastname("Souli");
        List<Customer> customers = customerService.getAllCustomers();
        customers.add(customer1);
        return customers;
    }

    @PostMapping(value = "/createCustomer")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void createUser(@RequestBody Customer customer){
        customerService.createCustomer(customer);
    }

    @PutMapping(value="/updateCustomer")
    @ResponseStatus(value= HttpStatus.NO_CONTENT)
    public void updateCustomer(@RequestBody Customer customer){
        customerService.update(customer);
    }

    @DeleteMapping(value="/deleteCustomer")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteCustomer(@RequestBody Customer customer){
        customerService.deleteCustomer(customer);
    }
}
