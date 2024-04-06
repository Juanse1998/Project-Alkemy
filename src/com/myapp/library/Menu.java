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
    String dni;
    String qualify;


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
                scanner.nextLine();
                break;
            case 2:
                System.out.println("Ingrese el nombre del usuario");
                name = scanner.nextLine();
                System.out.println("Ingrese el dni del usuario");
                dni = scanner.nextLine();
                userService.createUser(name, dni);
                scanner.nextLine();
                break;
            case 3:
                System.out.println("Ingrese el ISBN del libro");
                ISBN = scanner.nextLine();
                System.out.println( bookService.searchBookIsbn(ISBN));
                scanner.nextLine();
                break;
            case 4:
                System.out.println("Ingrese el titulo del libro");
                title = scanner.nextLine();
                System.out.println(bookService.searchBookTitle(title));
                scanner.nextLine();
                break;
            case 5:
                System.out.println("Ingrese el autor del libro");
                author = scanner.nextLine();
                System.out.println(bookService.searchBookAuthor(author));
                scanner.nextLine();
                break;
            case 6:
                System.out.println("Ingrese el genero del libro");
                gender = scanner.nextLine();
                System.out.println(bookService.searchBookGender(gender));
                scanner.nextLine();
                break;
            case 7:
                System.out.println("Ingrese el dni del usuario");
                dni = scanner.nextLine();
                System.out.println("Ingrese el ISBN del libro que se le va a prestar");
                ISBN = scanner.nextLine();
                Book bookLend = bookService.searchBookIsbn(ISBN);
                User userLend = userService.searchUser(dni);
                userService.lendBook(userLend, bookLend);
                scanner.nextLine();
                break;
            case 8:
                System.out.println("Ingrese su DNI");
                dni = scanner.nextLine();
                System.out.println("Ingrese el ISBN del libro");
                ISBN = scanner.nextLine();
                Book book = bookService.searchBookIsbn(ISBN);
                User user = userService.searchUser(dni);
                System.out.println("Quiere calificar el libro?: Ingrese y o n");
                qualify = scanner.nextLine();
                if (qualify.equals("y")) {
                    System.out.println("Ingrese un valor de 1 al 5");
                    Integer rating = scanner.nextInt();
                    bookService.setQualify(rating, book);
                }
                userService.returnBook(user, book);
                scanner.nextLine();
                break;
            case 9:
                System.out.println(userService.getUsers());
                break;
            case 10:
                System.out.println(userService.getAllBooksLend());
                break;
            case 11:
                System.out.println(bookService.getLibrary());
                break;
        }
    }


}
