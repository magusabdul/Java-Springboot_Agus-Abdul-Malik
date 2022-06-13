package com.magusabdul.graphql.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.magusabdul.graphql.entity.Author;

@Controller
public class AuthController  {
    
    @QueryMapping
    List<Author> author(){
        List<Author> authors = new ArrayList<>();
        authors.add(new Author(1, "Alex", "Under"));
        return authors;
    }
}
