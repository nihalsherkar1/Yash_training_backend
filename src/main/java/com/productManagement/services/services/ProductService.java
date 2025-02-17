package com.productManagement.services.services;

import com.productManagement.entity.Product;

import java.util.List;

public interface ProductService {


    public Product addProduct(Product product);

    List<Product> getAllProduct();
}
