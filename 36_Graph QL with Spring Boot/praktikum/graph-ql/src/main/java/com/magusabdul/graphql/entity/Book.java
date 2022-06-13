package com.magusabdul.graphql.entity;

public class Book {
    public int id;

    public String title;

    public String pageCount;

    public int authorId;

    public Book(int id, String title, String pageCount, int authorId) {
        this.id = id;
        this.title = title;
        this.pageCount = pageCount;
        this.authorId = authorId;
    }
    

}
