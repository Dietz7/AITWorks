package homework_32.model;

public class Laptop extends Computer {
    private double discountPercentage;
    private int batteryCapacity;

    public Laptop(String brand, String cpu, int ram, double price, boolean discount, long msn, double discountPercentage, int batteryCapacity) {
        super(brand, cpu, ram, price, discount, msn);
        this.discountPercentage = discountPercentage;
        this.batteryCapacity = batteryCapacity;
    }

    public double getDiscountPercentage() {
        return discountPercentage;

    }
    @Override
    public double calcDiscount() {
        if (isDiscount()) {  // Assuming isDiscount() is a getter for the discount field
            return getPrice() - (getPrice() * discountPercentage / 100);
        } else {
            return getPrice();
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(", discount percentage: ").append(discountPercentage);
        sb.append(", battery capacity: ").append(batteryCapacity);
        return sb.toString();
    }
}

