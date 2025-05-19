package example1.refactor;

import example1.Transport;

/**
 *  -> Encapsulates object creation.
 *  -> now open for extension, closed for modification.
 */
public class Runner {

    public static void main(String[] args) {

        Logistics logistics;
        String type = "truck";
        if (type.equalsIgnoreCase("truck")) {
            logistics = new RoadLogistics();
        }else if (type.equalsIgnoreCase("ship")) {
            logistics = new SeaLogistics();
        }else {
            throw new IllegalArgumentException("Invalid Logistics Type.");
        }
        logistics.scheduleDelivery();
    }


}
