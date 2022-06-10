package com.magusabdul.integrationtest.repository;

import com.magusabdul.integrationtest.entity.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
