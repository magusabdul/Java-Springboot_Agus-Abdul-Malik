package com.magusabdul.demo.controller;

import com.magusabdul.demo.entity.Category;
import com.magusabdul.demo.repository.CategoryRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CategoriesController {
    @Autowired
    private CategoryRepository categoryRepository;
    
    @GetMapping("/categories")
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @GetMapping("/categories/{id}")
    public Optional<Category> getDetailCategory(@PathVariable Long id){
        return categoryRepository.findById(id);
    }

    @GetMapping("/category")
    public Category createdNewCategory(@RequestBody Category payload){
        return categoryRepository.save(payload);
    }

    @GetMapping("/categories/{id}")
    public Optional<Category> updateCategory(@PathVariable Long id, @RequestBody Category category) {
        Optional<Category> categoryById = categoryRepository.findById(id);
        categoryById.ifPresent(res -> {
            res.setName(category.getName());
            res.setDescription(category.getDescription());

            categoryRepository.save(res);
        });

        return categoryById;
    }

    @DeleteMapping("/categories/{id}")
    public void deleteCategory(@PathVariable Long id) {
        Optional<Category> categoryById = categoryRepository.findById(id);

        categoryById.ifPresent(res -> {
            categoryRepository.delete(res);
        });
    }
}
