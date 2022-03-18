package com.java.lab;

public class Main {

    private static final Menu MENU = new Menu();

    public static void main(String[] args) {

        Initialization initialization = new Initialization();
        initialization.run();
        while(true) {
            MENU.readMenu();
            MENU.controller();
        }
    }
}
