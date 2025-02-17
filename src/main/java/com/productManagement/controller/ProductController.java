package com.productManagement.controller;


import com.productManagement.entity.Category;
import com.productManagement.entity.Product;
import com.productManagement.services.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin("*")
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public ResponseEntity<String> addProduct(@RequestBody Product product){

        Product data= productService.addProduct(product);

        return  new ResponseEntity<>("Product added successfully !!", HttpStatus.CREATED);
    }
    @GetMapping()
    public ResponseEntity<List<Product>> getAllProduct(   ){
        List<Product> data= productService.getAllProduct();

        return  new ResponseEntity<>( data, HttpStatus.OK);
    }

}
