package homework_32.model;

public class Computer {
    private String brand;
    private String cpu;
    private int ram;
    private double price;
    private boolean discount;
    private long serialNumber;

    public Computer(String brand, String cpu, int ram, double price, boolean discount, long serialNumber) {
        this.brand = brand;
        this.cpu = cpu;
        this.ram = ram;
        this.price = price;
        this.discount = discount;
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean hasDiscount(){
        return discount;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    private double displaySize;
    private int batteryCapacity;
    private String operationSystem;
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Computer");
        sb.append("brand = ").append(brand);
        sb.append(", cpu:  ").append(cpu);
        sb.append(", ram:  ").append(ram);
        sb.append(", price:  ").append(price);
        sb.append(", discount:  ").append(discount);
        sb.append(", serial number: ").append(serialNumber);
        return sb.toString();
    }
}
