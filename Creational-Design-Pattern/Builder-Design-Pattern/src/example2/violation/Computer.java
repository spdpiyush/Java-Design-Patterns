package example2.violation;

public class Computer {

    private String cpu;
    private String ram;
    private String storage;
    private String graphicsCard;
    private String coolingSystem;
    private String powerSupply;

    // Telescoping Constructor
    public Computer(String cpu, String ram, String storage, String graphicsCard, String coolingSystem, String powerSupply) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
        this.coolingSystem = coolingSystem;
        this.powerSupply = powerSupply;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", coolingSystem='" + coolingSystem + '\'' +
                ", powerSupply='" + powerSupply + '\'' +
                '}';
    }
}
