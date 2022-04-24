package com.magusabdul.springmongo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("product")
public class Product {
    @Id
    public String id;
    public String name;
    public Integer qty;
    public float price;
    public List<String> tags;
}
