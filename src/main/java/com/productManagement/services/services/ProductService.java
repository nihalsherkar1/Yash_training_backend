package com.productManagement.services.services;

import com.productManagement.ProductResponse;
import com.productManagement.entity.Product;

import java.util.List;

public interface ProductService {


    public Product addProduct(Product product);

    ProductResponse getAllProduct(Integer pageNumber, Integer pageSize);
}
