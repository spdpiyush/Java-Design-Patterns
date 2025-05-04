package example2.refactor;

public class Computer {

    private String cpu;
    private String ram;
    private String storage;
    private String graphicsCard;
    private String coolingSystem;
    private String powerSupply;


    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public String getCoolingSystem() {
        return coolingSystem;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    private void setCpu(String cpu) {
        this.cpu = cpu;
    }

    private void setRam(String ram) {
        this.ram = ram;
    }

    private void setStorage(String storage) {
        this.storage = storage;
    }

    private void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    private void setCoolingSystem(String coolingSystem) {
        this.coolingSystem = coolingSystem;
    }

    private void setPowerSupply(String powerSupply) {
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

    public static class ComputerBuilder {

        private String cpu;
        private String ram;
        private String storage;
        private String graphicsCard;
        private String coolingSystem;
        private String powerSupply;
        private Computer computer;

        public ComputerBuilder withCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder withRam(String ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder withStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder withGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public ComputerBuilder withCoolingSystem(String coolingSystem) {
            this.coolingSystem = coolingSystem;
            return this;
        }

        public ComputerBuilder withPowerSupply(String powerSupply) {
            this.powerSupply = powerSupply;
            return this;
        }

        public Computer build() {
            this.computer = new Computer();
            computer.setCpu(cpu);
            computer.setRam(ram);
            computer.setStorage(storage);
            computer.setGraphicsCard(graphicsCard);
            computer.setCoolingSystem(coolingSystem);
            computer.setPowerSupply(powerSupply);
            return computer;
        }

        public Computer getComputer() {
            return this.computer;
        }
    }
}
