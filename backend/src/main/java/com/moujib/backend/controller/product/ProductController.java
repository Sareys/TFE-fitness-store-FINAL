package com.moujib.backend.controller.product;

import com.moujib.backend.model.product.Clothe;
import com.moujib.backend.model.product.Equipment;
import com.moujib.backend.model.product.Food;
import com.moujib.backend.model.product.Product;
import com.moujib.backend.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


//Use this class to return new Products or recommendation on the front page
//TODO: Change all @Controller with @RestController(Eliminates the need to add @ResponseBody to each method)
@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController (ProductService productService){
        this.productService = productService;
    }

    @RequestMapping("/allProducts")
    public List<Product> allProducts(){
        return productService.allProducts();
    }

}
