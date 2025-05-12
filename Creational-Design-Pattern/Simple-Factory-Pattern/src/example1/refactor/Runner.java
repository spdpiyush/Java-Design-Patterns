package example1.refactor;

import example1.Pizza;

public class Runner {

    public static void main(String[] args) {

        Pizza pizza = PizzaFactory.createPizza("margherita");
        pizza.preparePizza();
    }
}
