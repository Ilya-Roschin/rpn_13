package com.java.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Logic {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Van VAN = new Van();

    public void findAllCoffeeByType() {
        System.out.println("Введите тип коффе");
        String coffeeType = SCANNER.nextLine();
        List<Coffee> coffees = VAN.findAll();
        List<Coffee> foundedCoffees = new ArrayList<>();

        for (Coffee element : coffees) {
            if (element.getType().equals(coffeeType)) {
                foundedCoffees.add(element);
            }
        }
        if (foundedCoffees.size() != 0) {
            for (Coffee element : foundedCoffees) {
                System.out.println(element.toString());
            }
        } else {
            System.out.println("Неверный тип коффе");
        }
    }

    public void findAllCoffeeBySort() {
        System.out.println("Введите сорт коффе");
        String coffeeSort = SCANNER.nextLine();
        List<Coffee> coffees = VAN.findAll();
        List<Coffee> foundedCoffees = new ArrayList<>();
        for (Coffee element : coffees) {
            if (element.getSortOfCoffee().equals(coffeeSort)) {
                foundedCoffees.add(element);
            }
        }
        if (foundedCoffees.size() != 0) {
            for (Coffee element : foundedCoffees) {
                System.out.println(element.toString());
            }
        } else {
            System.out.println("Неверный сорт коффе");
        }
    }


    public void findAllCoffees() {
        List<Coffee> coffees = VAN.findAll();

        for (Coffee element: coffees) {
            System.out.println(element);
        }
    }

    public void sortByWeightAndCoast() {

        List<Coffee> coffees = VAN.findAll();

        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < coffees.size() - 1; i++) {
                if (coffees.get(i).getCoast() / coffees.get(i).getWeight() >
                        coffees.get(i+1).getCoast() / coffees.get(i+1).getWeight()) {
                    Coffee temp = coffees.get(i);
                    coffees.set(i, coffees.get(i+1));
                    coffees.set(i+1, temp);
                    sorted = false;
                }
            }
        }
    }
}
