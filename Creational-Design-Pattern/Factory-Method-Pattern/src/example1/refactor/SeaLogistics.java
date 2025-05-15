package example1.refactor;

import example1.Ship;
import example1.Transport;

public class SeaLogistics extends Logistics{

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
