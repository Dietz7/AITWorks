package homework_32.model;

public class Smartphone extends Laptop {
    private String operationSystem;

    public Smartphone(String brand, String cpu, int ram, double price, boolean discount, long msn, double discountPercentage, int batteryCapacity, String operationSystem) {
        super(brand, cpu, ram, price, discount, msn, discountPercentage, batteryCapacity);
        this.operationSystem = operationSystem;
    }

    @Override
    public double calcDiscount() {
        if (isDiscount()) {
            return getPrice() - (getPrice() * getDiscountPercentage() / 100);
        } else {
            return getPrice();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(", operation system: ").append(operationSystem);
        return sb.toString();
    }
}
