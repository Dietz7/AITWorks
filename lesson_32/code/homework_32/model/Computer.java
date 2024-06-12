package homework_32.model;

public abstract class Computer {
    public static final int BARCODE_LENGTH = 7;
    private String brand;
    private String cpu;
    private int ram;
    private double price;
    private double discountPercentage;
    private boolean discount;

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    private long msn; // manufacture serial number

    public Computer(String brand, String cpu, int ram, double price, boolean discount, long msn) {
        this.brand = brand;
        this.cpu = cpu;
        this.ram = ram;
        this.price = price;
        this.discount = discount;
        this.msn = checkMsn(msn);
    }

    private long checkMsn(long msn) {
        if (countDigit(msn) == BARCODE_LENGTH) {
            return msn;
        }
        return -1;
    }
    private int countDigit(long msn) {
        int count = 0;
        do {
            count++;
            msn = msn / 10;
        } while (msn != 0);

        return count;
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

    public boolean isDiscount() {
        return discount;
    }
    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
    public long getMsn() {
        return msn;
    }


    // ABSTRACT Method to calculate the discount - that is why NO BODY  in this method
    public abstract double calcDiscount();


    //private double displaySize;
    //private int batteryCapacity;
    //private String operationSystem;
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Computer");
        sb.append("brand = ").append(brand);
        sb.append(", cpu:  ").append(cpu);
        sb.append(", ram:  ").append(ram);
        sb.append(", price:  ").append(price);
        sb.append(", discount:  ").append(discount);
        sb.append(", msn: ").append(msn);
        return sb.toString();
    }
}
