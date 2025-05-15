package example1;

import example1.Transport;

public class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivering by land in a Truck..");
    }
}
