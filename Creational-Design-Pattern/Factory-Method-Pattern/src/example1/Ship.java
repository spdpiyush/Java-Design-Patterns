package example1;

import example1.Transport;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivering by Sea in a ship..");
    }
}
