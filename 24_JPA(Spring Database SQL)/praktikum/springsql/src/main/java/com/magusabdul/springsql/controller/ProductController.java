package com.magusabdul.springsql.controller;

import com.magusabdul.springsql.model.Product;
import com.magusabdul.springsql.service.ProductService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    private ProductService productService;

    @GetMapping("/id")
    Product getProductById(@PathVariable("id") Long id){
        return productService.getProduct(id);
    }
}
