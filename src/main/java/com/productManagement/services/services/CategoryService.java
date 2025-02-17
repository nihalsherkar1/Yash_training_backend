package com.productManagement.services.services;

import com.productManagement.entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    public Category addCategory(Category category);

    Optional<Category> getCategoryById(Long id);

    List<Category> getCategoryAll();
}
