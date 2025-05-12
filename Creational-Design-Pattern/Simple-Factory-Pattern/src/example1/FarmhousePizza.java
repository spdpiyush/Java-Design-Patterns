package example1;

import example1.Pizza;

public class FarmhousePizza implements Pizza {

    @Override
    public void preparePizza() {
        System.out.println("Preparing FarmHouse Pizza....");
    }
}
