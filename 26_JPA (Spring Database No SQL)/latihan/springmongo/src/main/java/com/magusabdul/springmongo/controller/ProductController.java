package com.magusabdul.springmongo.controller;

import java.util.List;

import com.magusabdul.springmongo.model.Product;
import com.magusabdul.springmongo.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    
    @Autowired
    private final ProductService productService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Product product){
        Product productCreated = productService.create(product);
        return ResponseEntity.ok(productCreated);
    }

    @GetMapping
    public ResponseEntity<?> listProduct(){
        List<Product> products = productService.findAll();
        return ResponseEntity.ok(products);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> product(@PathVariable("id") String id) {
        try {
            Product product = productService.findById(id);
            return ResponseEntity.ok(product);
        } catch (Exception e) {
            InternalError internalError = new InternalError(e.getMessage());
            return ResponseEntity.internalServerError().body(internalError);
        }
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") String id, @RequestBody Product product) {
        try {
            Product productUpdated = productService.update(id, product);
            return ResponseEntity.ok(productUpdated);
        } catch (Exception e) {
            InternalError internalError = new InternalError(e.getMessage());
            return ResponseEntity.internalServerError().body(internalError);
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") String id) {
        try {
            productService.delete(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            InternalError internalError = new InternalError(e.getMessage());
            return ResponseEntity.internalServerError().body(internalError);
        }
    }
}
