package com.moujib.backend.service.product;

import com.moujib.backend.model.product.Clothe;
import com.moujib.backend.model.product.Food;
import com.moujib.backend.model.product.Product;
import com.moujib.backend.repository.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product getProductById(int id) {
        return null;
    }

    @Override
    public List<Product> allProducts() {
        Product clothe1 = new Clothe();
        clothe1.setDescription("Un truc renvoyé du backend donc c'rest bon mon gars");
        clothe1.setName("Vest BACKEND LIMITE");
        clothe1.setId(1);
        ((Clothe) clothe1).setSex("female");

        Product food1 = new Food();
        food1.setDescription("Un truc renvoyé du backend donc c'rest bon mon gars MAIS VERSION BOUFFE");
        food1.setName("PROTEINE WHEY DE MALADE");
        food1.setId(1);
        ((Food) food1).setFoodType("Whey");

        List<Product> products = new ArrayList<>();
        products.add(food1);
        products.add(clothe1);
//        productRepository.findAll().forEach(products::add);
        return products;
    }
}