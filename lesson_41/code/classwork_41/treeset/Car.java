package classwork_41.treeset;

import java.util.Objects;

public class Car implements Comparable<Car> {

    private String regNumber;
    private String model;
    private int age;
    private double enginePower;
    private int mileage;

    public Car(String regNumber, String model, int age, double enginePower, int mileage) {
        this.regNumber = regNumber;
        this.model = model;
        this.age = age;
        this.enginePower = enginePower;
        this.mileage = mileage;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Objects.equals(regNumber, car.regNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber);
    }

    @Override
    public String toString() {
        return "Car{" +
                "regNumber='" + regNumber + '\'' +
                ", model='" + model + '\'' +
                ", age=" + age +
                ", enginePower=" + enginePower +
                ", mileage=" + mileage +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return this.regNumber.compareTo(o.regNumber);
    }
}
