package com.java.lab;

import java.util.Objects;

public class Coffee {

    private String type;
    private double coast;
    private double weight;
    private double numberOfCoffees;
    private String sortOfCoffee;


    public Coffee() {
    }

    public Coffee(String type, double coast, double weight, double numberOfCoffees, String sortOfCoffee) {
        this.type = type;
        this.coast = coast;
        this.weight = weight;
        this.numberOfCoffees = numberOfCoffees;
        this.sortOfCoffee = sortOfCoffee;
    }

    public String getSortOfCoffee() {
        return sortOfCoffee;
    }

    public void setSortOfCoffee(String sortOfCoffee) {
        this.sortOfCoffee = sortOfCoffee;
    }

    public double getNumberOfCoffees() {
        return numberOfCoffees;
    }

    public void setNumberOfCoffees(double numberOfCoffees) {
        this.numberOfCoffees = numberOfCoffees;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCoast() {
        return coast;
    }

    public void setCoast(double coast) {
        this.coast = coast;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return
                "тип =" + type + '\'' +
                ", цена =" + coast +
                ", вес =" + weight +
                ", количество =" + numberOfCoffees +
                ", sortOfCoffee='" + sortOfCoffee + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coffee coffee = (Coffee) o;
        return Double.compare(coffee.coast, coast) == 0 && Double.compare(coffee.weight, weight) == 0 && Double.compare(coffee.numberOfCoffees, numberOfCoffees) == 0 && Objects.equals(type, coffee.type) && Objects.equals(sortOfCoffee, coffee.sortOfCoffee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, coast, weight, numberOfCoffees, sortOfCoffee);
    }
}
