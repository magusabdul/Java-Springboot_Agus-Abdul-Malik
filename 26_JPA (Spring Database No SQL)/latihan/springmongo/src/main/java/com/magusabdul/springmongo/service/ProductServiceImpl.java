package com.magusabdul.springmongo.service;

import java.util.List;

import com.magusabdul.springmongo.model.Product;
import com.magusabdul.springmongo.repository.ProductRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    @Override
    public Product create(Product product) {
        // TODO Auto-generated method stub
        return productRepository.save(product);
    }

    @Override
    public List<Product> findAll() {
        // TODO Auto-generated method stub
        return productRepository.findAll();
    }

    @Override
    public Product findById(String id) {
        // TODO Auto-generated method stub
        return productRepository.findById(id).orElseThrow(()->{
            throw new RuntimeException("Not Found");
        });
    }

    @Override
    public Product update(String id, Product product) {
        // TODO Auto-generated method stub
        Product productById = this.findById(id);
        productById.setName(product.getName());
        productById.setPrice(product.getPrice());
        productById.setQty(product.getQty());
        return productRepository.save(productById);
    }

    @Override
    public void delete(String id) {
        // TODO Auto-generated method stub
        Product product = this.findById(id);
        productRepository.delete(product);
    }
}
