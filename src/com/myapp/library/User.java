package com.myapp.library;

import java.util.ArrayList;

public class User {
    private String name;

    private ArrayList<Book> books;

    String id;

    public User (String name) {
        this.name = name;
        this.books = new ArrayList<Book>();
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setBook(Book book) {
        books.add(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public String toString() {
        return "Nombre: " + name + "\nLibros: " + books ;
    }

}
