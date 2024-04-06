package com.myapp.library;

import java.util.ArrayList;

public class User {
    private String name;

    private ArrayList<Book> books;

    String dni;

    public User (String name, String dni) {
        this.name = name;
        this.dni = dni;
        this.books = new ArrayList<Book>();
    }


    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDni() {
        return dni;
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
        return "Nombre: " + name + "\nDNI: " + dni + "\nLibros: " + books ;
    }

}
