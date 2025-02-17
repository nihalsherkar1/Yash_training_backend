package com.productManagement.services.impl;


import com.productManagement.entity.Category;
import com.productManagement.repository.CategoryRepository;
import com.productManagement.services.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category addCategory(Category category) {
        Category add= categoryRepository.save(category);
        return add;
    }

    @Override
    public Optional<Category> getCategoryById(Long id) {
         Optional<Category> data= categoryRepository.findById(id);
        return data ;
    }

    @Override
    public List<Category> getCategoryAll() {
        return categoryRepository.findAll();
    }
}
