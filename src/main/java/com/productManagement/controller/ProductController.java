package com.productManagement.controller;


import com.productManagement.ProductResponse;
import com.productManagement.entity.AppConstants;
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
    public ResponseEntity<ProductResponse> getAllProduct(@RequestParam(name = "pageNumber",defaultValue = AppConstants.PAGE_NUMBER,required = false )  Integer pageNumber,
                                                         @RequestParam(name = "pageSize",defaultValue = AppConstants.PAGE_SIZE,required = false)             Integer pageSize  ){
        ProductResponse data= productService.getAllProduct(pageNumber, pageSize);

        return  new ResponseEntity<>( data, HttpStatus.OK);
    }

}
