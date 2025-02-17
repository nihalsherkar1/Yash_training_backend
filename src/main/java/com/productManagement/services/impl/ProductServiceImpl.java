package com.productManagement.services.impl;

import com.productManagement.entity.Product;
import com.productManagement.repository.ProductRepository;
import com.productManagement.services.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Date;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        product.setDate( new Date());
        Product add= productRepository.save(product);
        return add;
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
}
