package com.magusabdul.springmongo.service;

import java.util.List;

import com.magusabdul.springmongo.model.Product;

public interface ProductService {
    Product create(Product product);
    List<Product> findAll();
    Product findById(String  id);
    Product update(String id, Product product);
    void delete(String id);
}
