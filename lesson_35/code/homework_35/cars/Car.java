package homework_35.cars;

import java.util.Objects;

public class Car implements Comparable<Car> {
    private String brand;
    private String colour;
    private int price;
    private int age;

    public Car(String brand, String colour, int price, int age) {
        this.brand = brand;
        this.colour = colour;
        this.price = price;
        this.age = age;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Car ");
        sb.append(" Brand = ").append(brand);
        sb.append(", colour: ").append(colour);
        sb.append(", price: ").append(price);
        sb.append(", age:  ").append(age);
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return price == car.price && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price);
    }

    @Override
    public int compareTo(Car o) {
        if (o == null) {
            return 1;
        }
      if(this.brand != o.brand){
        return this.brand.compareTo(o.brand);
      }
        return this.price - o.price;
    }
}
