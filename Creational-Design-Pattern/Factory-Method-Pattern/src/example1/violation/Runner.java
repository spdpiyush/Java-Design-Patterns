package example1.violation;

import example1.Transport;
import example1.Ship;
import example1.Truck;

/**
 *  -> Clients directly instantiating specific transportTypes.
 *  -> code is not scalable or maintainable.
 */
public class Runner {

    public static void main(String[] args) {

        Transport transport;
        String transportType = "ship";

        if (transportType.equalsIgnoreCase("ship")) {
            transport = new Ship();
        }else if (transportType.equalsIgnoreCase("truck")) {
            transport = new Truck();
        }else {
            throw new IllegalArgumentException("Invalid transportType");
        }
        transport.deliver();
    }
}
