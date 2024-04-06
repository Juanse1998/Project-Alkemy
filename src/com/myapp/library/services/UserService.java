package com.myapp.library.services;
import com.myapp.library.Book;
import com.myapp.library.User;
import java.util.ArrayList;

public class UserService {

    private ArrayList<User> users;

    public UserService(ArrayList<User> users) {
        this.users = users;
    }


    public void createUser(String name) {
        User newUser = new User(name);
        users.add(newUser);
    }

    public ArrayList<User> getUsers() {
        return users;
    }


    // update user
    public void updateUser(String name, String id) {
        for(User user: users) {
            if (user.getId().equals(id)) {
                user.setName(name);
                return;
            }
        };
    }

    public void deleteUser(String id) {
        users.removeIf(user -> user.getId().equals(id));
    }

    public User searchUser(String name) {
        for(User user: users)  {
            if (user.getName().equals(name)) {
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

    public void returnBook(User user, Book book) {
        if (user.getBooks().contains(book)) {
            user.getBooks().remove(book);
            book.setAvailable(true);
        } else {
            System.out.println("Este libro no es correcto");
        }
    }

}
