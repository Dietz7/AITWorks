package homework_32.model;

import java.math.BigInteger;

public class Laptop extends Computer {
    private double displaySize;
    private int batteryCapacity;

    public Laptop(String brand, String cpu, int ram, double price, boolean discount, long serialNumber, double displaySize, int batteryCapacity) {
        super(brand, cpu, ram, price, discount, serialNumber);
        this.displaySize = displaySize;
        this.batteryCapacity = batteryCapacity;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(", display size: ").append(displaySize);
        sb.append(", battery capacity: ").append(batteryCapacity);
        return sb.toString();
    }
}

