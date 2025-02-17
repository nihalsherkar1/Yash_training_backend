package com.productManagement.services.impl;

import com.productManagement.ProductResponse;
import com.productManagement.entity.Product;
import com.productManagement.repository.ProductRepository;
import com.productManagement.services.services.ProductService;
import org.hibernate.Internal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
    public ProductResponse getAllProduct(Integer pageNumber, Integer pageSize) {
        Pageable pageDetails = PageRequest.of(pageNumber, pageSize);

        Page<Product> pageProduct = productRepository.findAll(pageDetails);

        List<Product> products= pageProduct.getContent();



        ProductResponse productResponse =new ProductResponse();
        productResponse.setContent(products);
        productResponse.setPageNumber(pageProduct.getNumber());
        productResponse.setPageSize(pageProduct.getSize());
        productResponse.setPageSize(pageProduct.getSize());
        productResponse.setTotalElements(pageProduct.getTotalElements());
        productResponse.setTotalPages(pageProduct.getTotalPages());
        productResponse.setLastPage(pageProduct.isLast());

        return productResponse;
    }
}
