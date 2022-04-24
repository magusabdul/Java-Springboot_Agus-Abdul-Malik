package com.magusabdul.springsql.repository;

import com.magusabdul.springsql.model.Product;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
    
}
