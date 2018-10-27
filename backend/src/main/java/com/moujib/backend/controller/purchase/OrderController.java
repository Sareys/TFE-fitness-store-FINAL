package com.moujib.backend.controller.purchase;

import com.moujib.backend.model.purchase.CustomerOrder;
import com.moujib.backend.service.purchase.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private CustomerOrderService customerOrderService;

    @RequestMapping("/placeOrder")
    public void createOrder(@RequestBody CustomerOrder customerOrder) {
        customerOrderService.addCustomerOrder(customerOrder);
    }
}
