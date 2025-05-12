package example1.refactor;

import example1.FarmhousePizza;
import example1.MargheritaPizza;
import example1.Pizza;
import example1.VegExtravaganzaPizza;

/**
 *  -> Centralized Object Creation logic.
 */
public class PizzaFactory {

    public static Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("farmhouse")) {
           return new FarmhousePizza();
        }else if (type.equalsIgnoreCase("margherita")) {
           return new MargheritaPizza();
        }else if (type.equalsIgnoreCase("vegextravaganza")) {
            return   new VegExtravaganzaPizza();
        }else {
            throw new IllegalArgumentException("Invalid pizza Type = " + type);
        }
    }
}
