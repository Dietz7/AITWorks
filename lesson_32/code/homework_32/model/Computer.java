package homework_32.model;

public class Computer {
    private String brand;
    private String cpu;
    private int ram;
    private double price;
    private long serialNumber; 

    public Computer(String brand, String cpu, int ram, double price, long serialNumber) {
        this.brand = brand;
        this.cpu = cpu;
        this.ram = ram;
        this.price = price;
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

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Computer");
        sb.append("brand = ").append(brand);
        sb.append(", cpu:  ").append(cpu);
        sb.append(", ram:  ").append(ram);
        sb.append(", msn:  ").append(serialNumber);
        return sb.toString();
    }

}
