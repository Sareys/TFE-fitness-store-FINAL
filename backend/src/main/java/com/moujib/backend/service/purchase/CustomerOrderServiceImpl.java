package com.moujib.backend.service.purchase;

import com.moujib.backend.model.purchase.CustomerOrder;
import com.moujib.backend.repository.purchase.CustomerOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService{

    @Autowired
    private CustomerOrderRepository customerOrderRepository;

    @Override
    public void addCustomerOrder(CustomerOrder customerOrder) {
        customerOrderRepository.save(customerOrder);
    }
}
