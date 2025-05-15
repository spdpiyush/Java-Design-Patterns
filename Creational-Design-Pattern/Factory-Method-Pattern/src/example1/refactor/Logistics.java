package example1.refactor;

import example1.Transport;

public abstract class Logistics {

    protected abstract Transport createTransport();

    public void scheduleDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}
