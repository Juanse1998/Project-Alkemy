package com.myapp.library.services;
import com.myapp.library.Book;
import com.myapp.library.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class BookService {

    private ArrayList<Book> library;

    public BookService(ArrayList<Book> library) {
        this.library = library;
    }


    public void createBook(String title, String author, String gender, String ISBN) {
        Book newBook = new Book(title, author, gender, ISBN);
        library.add(newBook);
    }

    public ArrayList<Book> getLibrary() {
        return library;
    }


    // update book
    public void updateBook(String newTitle, String newAuthor, String newGender, String ISBN) {
        for(Book book: library) {
            if (book.getISBN().equals(ISBN)) {
                book.setTitle(newTitle);
                book.setAuthor(newAuthor);
                book.setGender(newGender);
                return;
            }
        };
    }

    public void deleteBook(String ISBN) {
        library.removeIf(book -> book.getISBN().equals(ISBN));
    }

    public Book searchBookIsbn(String ISBN) {
        for(Book book: library)  {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        };
        return null;
    }

    public Book searchBookTitle(String title) {
        for(Book book: library)  {
            if (book.getTitle().equals(title)) {
                return book;
            }
        };
        return null;
    }

    public Book searchBookGender(String gender) {
        for(Book book: library)  {
            if (book.getGender().equals(gender)) {
                return book;
            }
        };
        return null;
    }

    public Book searchBookAuthor(String author) {
        for(Book book: library)  {
            if (book.getAuthor().equals(author)) {
                return book;
            }
        };
        return null;
    }

    public boolean availableBook(Book book) {
        return book.isAvailable();
    }

}
