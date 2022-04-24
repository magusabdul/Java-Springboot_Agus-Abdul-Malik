package com.magusabdul.springmongo.repository;

import com.magusabdul.springmongo.model.Product;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String>{
    
}
