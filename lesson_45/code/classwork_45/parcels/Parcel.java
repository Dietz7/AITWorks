package classwork_45.parcels;

import java.util.Objects;

/**Создайте класс Container с полями:
 String label (маркировка) и List<Box> - список коробок с посылками.
 Создайте класс Box с полем:
 List<Parcel> - список посылок.
 Классы Container и Box являются итерируемыми.
 Создайте класс Parcel (посылка) с полем double weight - вес посылки.
 Создайте класс ShipmentAppl с методом main.
 Задумайте случайное количество контейнеров (от 10 до 20).
 В каждом контейнере задумайте случайное количество коробок (от 10 до 20).
 В каждой коробке задумайте случайное количество посылок (от 5 до 10).
 Предположим, что каждая посылка в среднем имеет вес = 2 кг.*/

public class Parcel {
    private double weight;

    public Parcel(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Parcel parcel)) return false;
        return Double.compare(weight, parcel.weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "weight=" + weight +
                '}';
    }
}
