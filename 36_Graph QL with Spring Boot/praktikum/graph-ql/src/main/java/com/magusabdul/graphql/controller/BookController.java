package com.magusabdul.graphql.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.magusabdul.graphql.entity.Book;

@Controller
public class BookController {
    
    @QueryMapping
    public List<Book> books(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Buku Java", "255", 1));
        return books;
    }
}
