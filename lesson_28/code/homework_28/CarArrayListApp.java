package homework_28;


import homework_28.model.Car;

import java.sql.SQLOutput;

public class CarArrayListApp {
    public static void main(String[] args) {
        CarArrayList carList = new CarArrayList();
        // Creating car objects
        Car car1 = new Car("Mercedez", 2019);
        Car car2 = new Car("BMW", 2020);
        Car car3 = new Car("Renault", 2019);

        // Adding cars to the list

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);

        // Printing the list
        System.out.println("Car List:");
        for (int i = 0; i < carList.getCount(); i++) {
            System.out.println(carList.get(i));  // Using get(int index) method
        }

        // Removing a car
        System.out.println("\nRemoving car at index 1: ");
        Car removedCar = carList.remove(1);
        System.out.println("Removed car: " + removedCar);

        // Printing the updated list
        System.out.println("\nPrinting the updated list: ");
        for (int i = 0; i < carList.getCount(); i++) {
            System.out.println(carList.get(i));
        }
    }

}