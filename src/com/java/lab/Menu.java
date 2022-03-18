package com.java.lab;

import java.util.Scanner;

import static java.lang.System.exit;

public class Menu {

    private static final Logic LOGIC = new Logic();
    private static final Scanner SCANNER = new Scanner(System.in);

    public void readMenu() {
        System.out.println("User Menu \n" +
                "1. найти весь коффе \n" +
                "2. отсортировать цена / вес \n" +
                "3. найти по типу \n" +
                "4. найти по сорту \n" +
                "5. выход");
    }

    public void controller() {
        switch (choose()) {
            case 1:
                LOGIC.findAllCoffees();
                break;
            case 2:
                LOGIC.sortByWeightAndCoast();
                break;
            case 3:
                LOGIC.findAllCoffeeByType();
                break;
            case 4:
               LOGIC.findAllCoffeeBySort();
                break;
            case 5:
               exit(0);
            default:
                System.out.println("incorrect input!!!");
        }
        readMenu();
        controller();
    }

    private int choose() {
        return SCANNER.nextInt();
    }
}
