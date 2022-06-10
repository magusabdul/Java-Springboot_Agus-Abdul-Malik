package com.magusabdul.integrationtest.entity;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
@Entity
public class Category {

    @Autowired
    private Long id;
    private String name;
    private String description;
}
