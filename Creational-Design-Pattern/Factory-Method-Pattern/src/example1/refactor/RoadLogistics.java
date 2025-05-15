package example1.refactor;

import example1.Transport;
import example1.Truck;

public class RoadLogistics extends Logistics{

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
