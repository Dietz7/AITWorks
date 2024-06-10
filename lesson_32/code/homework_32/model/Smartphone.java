package homework_32.model;

public class Smartphone extends Laptop {
    private String operationSystem;

    public Smartphone(String brand, String cpu, int ram, double price, boolean discount, long serialNumber, double displaySize, int batteryCapacity, String operationSystem) {
        super(brand, cpu, ram, price, discount, serialNumber, displaySize, batteryCapacity);
        this.operationSystem = operationSystem;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(", operation system: ").append(operationSystem);
        return sb.toString();
    }
}
