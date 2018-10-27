package com.moujib.backend.repository.customer;

import com.moujib.backend.model.customer.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    @Query("SELECT c FROM Customer c ")
    List<Customer> getAllCustomers();

    @Query("SELECT c FROM Customer c WHERE c.id = :id")
    Customer getCustomerById(@Param("id")int id);

    @Query("SELECT c FROM Customer c WHERE c.username = :username")
    Customer getCustomerByUsername(String username);

}
