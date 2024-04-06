package com.myapp.library;
import com.myapp.library.services.BookService;
import com.myapp.library.Menu;
import com.myapp.library.services.UserService;

import java.util.Scanner;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        Integer option = 0;

        while (!option.equals(10)) {
            System.out.println("1- Cargar libro");
            System.out.println("2- Cargar usuario");
            System.out.println("3- Buscar libro por ISBN");
            System.out.println("4- Buscar libro por titulo");
            System.out.println("5- Buscar libro por autor");
            System.out.println("6- Buscar libro por genero");
            System.out.println("7- Prestar libro");
            System.out.println("8- Listar usuarios");
            System.out.println("9- Listar Libros");
            System.out.println("10- Salir");
            option = scanner.nextInt();
            menu.options(option);
        }
        
    }
}