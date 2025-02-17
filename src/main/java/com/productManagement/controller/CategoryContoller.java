package com.productManagement.controller;

import com.productManagement.entity.Category;
import com.productManagement.entity.Product;
import com.productManagement.services.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/category")
public class CategoryContoller {

    @Autowired
    private CategoryService categoryService;


    @PostMapping("/add")
    public ResponseEntity<String> addCategory(@RequestBody Category category){
        Category data= categoryService.addCategory(category);

        return  new ResponseEntity<>("Category added successfully !!", HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Optional<Category>> getCategoryById(@PathVariable Long id){
        Optional<Category> data= categoryService.getCategoryById(id);

        return  new ResponseEntity<>( data, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<Category>> getAllCategories(   ){
        List<Category> data= categoryService.getCategoryAll();

        return  new ResponseEntity<>( data, HttpStatus.OK);
    }
}
