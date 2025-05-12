package example1;

import example1.Pizza;

public class MargheritaPizza implements Pizza {

    @Override
    public void preparePizza() {
        System.out.println("Preparing Margherita Pizza...");
    }
}
