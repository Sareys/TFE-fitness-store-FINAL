package com.moujib.backend.service.product;

import com.moujib.backend.model.product.Product;

import java.util.List;

public interface ProductService {

    Product getProductById(int id);

    List<Product> allProducts();
}
