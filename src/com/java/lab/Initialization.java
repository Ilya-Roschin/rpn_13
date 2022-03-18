package com.java.lab;

public class Initialization {

    private static final Van VAN = new Van();

    public void run() {
        VAN.addCoffees(new Coffee("молотый", 200d, 1000d, 5, "sort"));
        VAN.addCoffees(new Coffee("зерновой", 300d, 500d, 15, "sort"));
        VAN.addCoffees(new Coffee("молотый", 250d, 500d, 14, "sort"));
        VAN.addCoffees(new Coffee("растворимый", 400d, 100d, 25, "sort"));
        VAN.addCoffees(new Coffee("растворимый", 150d, 300d, 3, "sort"));
        VAN.addCoffees(new Coffee("зерновой", 500d, 400, 4, "sort"));

    }
}
