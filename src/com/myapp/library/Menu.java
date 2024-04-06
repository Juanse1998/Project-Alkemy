package com.myapp.library;

import com.myapp.library.services.BookService;
import com.myapp.library.services.UserService;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private Integer option;
    Scanner scanner = new Scanner(System.in);

    String ISBN;
    String gender;
    String author;
    String title;
    String name;


    ArrayList<Book> library = new ArrayList<Book>();
    ArrayList<User> users = new ArrayList<User>();

    BookService bookService = new BookService(library);
    UserService userService = new UserService(users);

    public Menu() {}

    public void options(Integer option) {
        switch (option) {
            case 1:
                System.out.println("Ingrese el titulo del libro");
                title = scanner.nextLine();
                System.out.println("Ingrese el autor del libro");
                author = scanner.nextLine();
                System.out.println("Ingrese el genero del libro");
                gender = scanner.nextLine();
                System.out.println("Ingrese el ISBN del libro");
                ISBN = scanner.nextLine();
                bookService.createBook(title, author, gender, ISBN);
                break;
            case 2:
                System.out.println("Ingrese el nombre del usuario");
                name = scanner.nextLine();
                userService.createUser(name);
                break;
            case 3:
                System.out.println("Ingrese el ISBN del libro");
                ISBN = scanner.nextLine();
                System.out.println( bookService.searchBookIsbn(ISBN));
                break;
            case 4:
                System.out.println("Ingrese el titulo del libro");
                title = scanner.nextLine();
                System.out.println(bookService.searchBookTitle(title));
                break;
            case 5:
                System.out.println("Ingrese el autor del libro");
                author = scanner.nextLine();
                System.out.println(bookService.searchBookAuthor(author));
                break;
            case 6:
                System.out.println("Ingrese el genero del libro");
                gender = scanner.nextLine();
                System.out.println(bookService.searchBookGender(gender));
                break;
            case 7:
                System.out.println("Ingrese el nombre del usuario");
                name = scanner.nextLine();
                System.out.println("Ingrese el ISBN del libro que se le va a prestar");
                ISBN = scanner.nextLine();
                Book bookLend = bookService.searchBookIsbn(ISBN);
                User userLend = userService.searchUser(name);
                userService.lendBook(userLend, bookLend);
                break;
            case 8:
                System.out.println(userService.getUsers());
                break;
            case 9:
                System.out.println(userService.getAllBooksLend());
                break;
            case 10:
                System.out.println(bookService.getLibrary());
                break;
        }
    }


}
