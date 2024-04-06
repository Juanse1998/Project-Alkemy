package com.myapp.library;

public class Book {
    private String author;

    private String title;
    private String ISBN;
    private String gender;
    private boolean available;
    String id;

    public Book (String title, String author, String gender, String ISBN) {
        this.title = title;
        this.author = author;
        this.gender = gender;
        this.ISBN = ISBN;
        this.available = true;
    }


    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setGender(String genero) {
        this.gender = gender;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }


    public String getISBN() {
        return ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Boolean isAvailable() {
        return available;
    }

    public String getGender() {
        return gender;
    }

    public String toString() {
        return "\nTítulo: " + title + "\nGenero: " + gender + "\nAutor: " + author + "\nISBN: " + ISBN + "\nDisponible: " + available;
    }

}
