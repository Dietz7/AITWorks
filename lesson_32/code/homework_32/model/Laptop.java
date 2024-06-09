package homework_32.model;

import java.math.BigInteger;

public class Laptop extends Computer {
    private double displaySize;
    private int batteryCapacity;

    public Laptop(String brand, String cpu, int ram, double price, long serialNumber, double displaySize, int batteryCapacity) {
        super(brand, cpu, ram, price, serialNumber);
        this.displaySize = displaySize;
        this.batteryCapacity = batteryCapacity;
    }


    @Override
    public String toString() {
        // call the super class's (parent class is Computer) toString method
        StringBuilder sb = new StringBuilder(super.toString());
        // then we add (synonym "append") 2 Laptop-specific fields, please see above to understand why
        sb.append(", display size: ").append(displaySize);
        sb.append(", battery capacity: ").append(batteryCapacity);
        return sb.toString();

    }

}

