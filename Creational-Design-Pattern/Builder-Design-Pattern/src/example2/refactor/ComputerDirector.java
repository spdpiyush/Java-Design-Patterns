package example2.refactor;

/**
 * Reusable Director
 */
public class ComputerDirector {

    public static Computer buildGamingPC() {
        return new Computer.ComputerBuilder()
                .withCpu("Intel-i9")
                .withRam("32GM")
                .withStorage("1TB SDD")
                .withGraphicsCard("NVIDIA RTX 4090")
                .withCoolingSystem("Liquid Cooling")
                .withPowerSupply("850W")
                .build();
    }

    public static Computer buildOfficePC() {
        return new Computer.ComputerBuilder()
                .withCpu("Intel-i5")
                .withRam("16GM")
                .withStorage("512BB SDD")
                .withGraphicsCard("Intel Integrated Graphics")
                .withCoolingSystem("Air Cooling")
                .withPowerSupply("550W")
                .build();
    }

    public static Computer buildSimplePC() {
        return new Computer.ComputerBuilder()
                .withCpu("Intel-i3")
                .withRam("8GM")
                .withStorage("256TB SDD")
                .withPowerSupply("450W")
                .build();
    }
}
