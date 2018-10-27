package com.moujib.backend.repository.purchase;


import com.moujib.backend.model.purchase.CustomerOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerOrderRepository extends CrudRepository<CustomerOrder, Integer> {

}
