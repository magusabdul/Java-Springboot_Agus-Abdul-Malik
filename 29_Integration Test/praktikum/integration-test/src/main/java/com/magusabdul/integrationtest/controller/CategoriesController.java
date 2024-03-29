package com.magusabdul.integrationtest.controller;

import java.util.List;
import java.util.Optional;

import com.magusabdul.integrationtest.entity.Category;
import com.magusabdul.integrationtest.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CategoriesController {
    
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/categories")
    public List<Category> getAllCategoris(){
        return categoryRepository.findAll();
    }

    @GetMapping("/categoris/{id}")
    public Optional<Category> getDetailCategory(@PathVariable Long id){
        return categoryRepository.findById(id);
    }

    @PostMapping("/categories")
    public Category createNewCategory(@RequestBody Category payload) {
        return categoryRepository.save(payload);
    }

    @PutMapping("/categories/{id}")
    public Optional<Category> updateCategory(@PathVariable Long id, @RequestBody Category category){
        Optional<Category> categoryById = categoryRepository.findById(id);

        categoryById.ifPresent(res -> {
            res.setName(category.getName());
            res.setDescription(category.getDescription());

            categoryRepository.save(res);
        });
        return categoryById;
    }
}
