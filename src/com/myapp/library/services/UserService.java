package com.myapp.library.services;
import com.myapp.library.Book;
import com.myapp.library.User;
import java.util.ArrayList;

public class UserService {

    private ArrayList<User> users;

    public UserService(ArrayList<User> users) {
        this.users = users;
    }


    public void createUser(String name, String dni) {
        User newUser = new User(name, dni);
        users.add(newUser);
    }

    public ArrayList<User> getUsers() {
        return users;
    }


    // update user
    public void updateUser(String name, String dni) {
        for(User user: users) {
            if (user.getDni().equals(dni)) {
                user.setName(name);
                return;
            }
        };
    }

    public void deleteUser(String dni) {
        users.removeIf(user -> user.getDni().equals(dni));
    }

    public User searchUser(String dni) {
        for(User user: users)  {
            if (user.getDni().equals(dni)) {
                return user;
            }
        };
        return null;
    }

    public void lendBook(User user, Book book) {
        if (book.isAvailable()) {
            user.setBook(book);
            book.setAvailable(false);
        } else {
            System.out.println("El libro no esta disponible");
        }
    }

    public ArrayList<User> getAllBooksLend() {
        ArrayList<User> userBooks = new ArrayList<User>();
        for(User user: users) {
            if (!(user.getBooks().equals(null))) {
                userBooks.add(user);
            }
        };
        return userBooks;
    }

    public void returnBook(User user, Book book) {
        if (user.getBooks().contains(book)) {
            user.getBooks().remove(book);
            book.setAvailable(true);
        } else {
            System.out.println("Este libro no es correcto");
        }
    }

}
