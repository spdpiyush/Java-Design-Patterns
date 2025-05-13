package example1.violation;

import example1.FarmhousePizza;
import example1.MargheritaPizza;
import example1.Pizza;
import example1.VegExtravaganzaPizza;

/**
 *  -> Breaks Single Responsibility Principle.
 *  -> Hard to extend, Adding new Pizza change client logic
 *  -> Violates OCP
 */
public class Runner {

    public static void main(String[] args) {

        Pizza pizza;

        String pizzaType = "FarmhousePizza";
        if (pizzaType.equalsIgnoreCase("farmhousepizza")) {
            pizza = new FarmhousePizza();
        }else if (pizzaType.equalsIgnoreCase("margheritapizza")) {
            pizza = new MargheritaPizza();
        }else if (pizzaType.equalsIgnoreCase("vegextravaganzapizza")) {
            pizza = new VegExtravaganzaPizza();
        }else {
            throw new IllegalArgumentException("Invalid pizza Type");
        }
        pizza.preparePizza();
    }
}
