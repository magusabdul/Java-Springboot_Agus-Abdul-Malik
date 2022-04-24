package com.magusabdul.springsql.service;

import com.magusabdul.springsql.model.Product;
import com.magusabdul.springsql.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;
    
    @Override
    public Product getProduct(Long id) {
        // TODO Auto-generated method stub
        return productRepository.findById(id).orElse(null);
    }
    
}
