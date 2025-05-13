package example1;

import example1.Pizza;

public class VegExtravaganzaPizza implements Pizza {

    @Override
    public void preparePizza() {
        System.out.println("Preparing VegExtravaganzaPizza...");
    }
}
