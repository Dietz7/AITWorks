package homework_32.model;

import java.math.BigInteger;

public class Smartphone extends Laptop {
    private String operationSystem;

    public Smartphone(String brand, String cpu, int ram, double price, long serialNumber, double displaySize, int batteryCapacity, String operationSystem) {
        super(brand, cpu, ram, price, serialNumber, displaySize, batteryCapacity);
        this.operationSystem = operationSystem;
    }

    @Override
    public String toString() {
        // call the super class's (parent class is Laptop) toString method
        StringBuilder sb = new StringBuilder(super.toString());
        // then we add (synonym for word "append" - "add") 1 SMARTPHONE-specific field, please see above to understand why
        sb.append(", operation system: ").append(operationSystem);
        return sb.toString();

    }

}
