package classwork_14.car.model;

public class Car {
    // colour - String color = white, red,...
    // brand (marka) - String brand = Mercedes, BMW, VW, Audi...
    // tip transmission - boolean isManual = true, false.
    // price - int price = 100 000
    // year of production - int age = 2025, 2016,...
    // probeg - int km = ...

    // fields - polya  - eto charakteristiki objecta, kotoruj est v klasse

    private String color;
    private String brand;
    private boolean isManual;
    private int price;
    private int age;
    private int km;

    // sovokupnost etich polej  opisuvajet (zadajet, formirujet) object

    // constructor
    public Car(String color, String brand, boolean isManual, int price, int age, int km) {
        this.color = color;
        this.brand = brand;
        this.isManual = isManual;
        this.price = price;
        this.age = age;
        this.km = km;
    }

    // getters and setters
    // getters - eto methodu, kotoruje pozvolyajut poluchit znachenija polej (get = poluchit)
    // setter - eto tozhe methodu, kotoruje pozvolyajut ustanovit znachenija polej (set = ustanovit)


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void moveCar () {
        System.out.println("Car is moving...");
    }
    public void displayCar() {
        System.out.println(" Brand: " + brand + ", color: " + color + ", is manual: " + isManual + ", age " + age + ", price: " + price);
    }
}
