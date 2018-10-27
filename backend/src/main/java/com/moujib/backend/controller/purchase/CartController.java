package com.moujib.backend.controller.purchase;

import com.moujib.backend.model.customer.Customer;
import com.moujib.backend.model.purchase.Cart;
import com.moujib.backend.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/customer/cart")
public class CartController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/getCartByUsername")
    public Cart getCartByUsername(@AuthenticationPrincipal User activeUser){
        Customer customer = customerService.getCustomerByUsername (activeUser.getUsername());
        return customer.getCart();
    }

    @RequestMapping("/resetCart")
    public void resetCart(@AuthenticationPrincipal User activeUser) {
        Customer customer = customerService.getCustomerByUsername (activeUser.getUsername());
        Cart cart = customer.getCart();
        cart.setCartItems(new ArrayList<>());
        cart.setGrandTotal(0);
        customer.setCart(cart);
        customerService.update(customer);
    }
}
