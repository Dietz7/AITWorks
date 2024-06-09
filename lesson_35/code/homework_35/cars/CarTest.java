package homework_35.cars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

public class CarTest {
    Car [] cars;
    @BeforeEach
    void setUp() {
        cars = new Car[5];
        cars [0] = new Car ("Mercedez", "black", 95000, 2024);
        cars [1] = new Car ("Audi", "red", 85000, 2020);
        cars [2] = new Car ("Opel", "blue", 45000, 2019);
        cars [3] = new Car ("Mercedez", "black", 65000, 2018);
        cars [4] = new Car ("Renault Twingo", "yellow", 12500, 2017);

    }
    private void printArray(Object[] arr, String reportTitle) {
        System.out.println("======" + reportTitle + "=======");
        for (Object o : arr) {
            System.out.println(o);
        }
    }
    @Test
    void testPrint(){
        printArray(cars, "List of our cars that we placed in our setUp method");
    }

    @Test
    void testNativeSorting(){
        printArray(cars, "List of our cars that we placed in our setUp method");
        Arrays.sort(cars); // native sorting
        printArray(cars, "List of cars sorted by Brand");
    }
    @Test
    void testComparator(){
        Comparator<Car> comparator1 = (c1, c2) -> Integer.compare(c1.getPrice(), c2.getPrice());
        // lambda expression
        printArray(cars, "Before sorting");
        Arrays.sort(cars); // native sorting
        printArray(cars, "After sorting by Brand");
        Arrays.sort(cars, comparator1);
        printArray(cars, "After sorting by price");
        Assertions.assertEquals(12500, cars[0].getPrice(), "The first car should be the cheapest");
        Assertions.assertEquals("Renault Twingo", cars[0].getBrand(), "The first car should be Renault");
        Assertions.assertEquals(95000, cars[cars.length - 1].getPrice(), "The last car should be the most expensive");
        Assertions.assertEquals("Mercedez", cars[cars.length - 1].getBrand(), "The last car Mercedez");
    }
}
