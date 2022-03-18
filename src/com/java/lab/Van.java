package com.java.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Van {

    private static final List<Coffee> coffees = new ArrayList<>();

    public void addCoffees(Coffee coffee) {
        coffees.add(coffee);
    }

    public List<Coffee> findAll() {
        return coffees;
    }

    public Coffee findByType(String coffeeType) {
        for (Coffee element : coffees) {
            if (Objects.equals(element.getType(), coffeeType)) {
                return element;
            }
        }
        return new Coffee();
    }
}
