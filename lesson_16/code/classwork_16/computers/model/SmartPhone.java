package classwork_16.computers.model;

import classwork_17.computers.model.Laptop1;

public class SmartPhone extends Laptop1
{

    private String operationSystem;
    private boolean isSimCard;

    public SmartPhone(String cpu, int ram, int ssd, String brand, double price, double displaySize, double weight, int batteryCapacity, String operationSystem, boolean isSimCard) {
        super(cpu, ram, ssd, brand, price, displaySize, weight, batteryCapacity);
        this.operationSystem = operationSystem;
        this.isSimCard = isSimCard;
    }

    @Override
    public String toString() {
        return super.toString() + "SmartPhone{" + // dobavili "return super.toString() + "
                "operationSystem='" + operationSystem + '\'' +
                ", isSimCard=" + isSimCard +
                '}';
    }
}
