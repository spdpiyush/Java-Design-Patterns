package example2.violation;

/**
 *  -> Need to Pass all parameter, even optional one.
 */
public class Runner {

    public static void main(String[] args) {

        Computer gamingComputer = new Computer(
                "Intel i9",
                "32 GB",
                "1TB SSD",
                "NVIDIA RTX 4090",
                "Liquid Cooling",
                "750W"
        );
        System.out.println(gamingComputer);
    }
}
