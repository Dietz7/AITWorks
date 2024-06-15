package homework_36.city_arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;

public class CityTest {
    City[] cities;

    @BeforeEach
    void setUp() {
        cities = new City[6];
        cities[0] = new City("Berlin", 800_000, "USA", 7.0);
        cities[1] = new City("Berlin", 670_000, "USA", 7.5);
        cities[2] = new City("Chicago", 2_700_000, "USA", 6.0);
        cities[3] = new City("Atlanta", 470_000, "USA", 8.0);
        cities[4] = new City("New York", 8_500_000, "USA", 6.5);
        cities[5] = new City("Dallas", 1_300_000, "USA", 3.0);
    }

    private void printArray(Object[] arr, String title) {
        System.out.println("=======================" + title + "===========================");
        for (Object o : arr) {
            System.out.println(o);
        }
    }

    @Test
    void testComparable() {
        printArray(cities, "Original array: ");
        Arrays.sort(cities);
        printArray(cities, "Native sorting - by the name of the city");
        City city = new City("Chicago", 0, null, 0);
        int index = Arrays.binarySearch(cities, city); // key for searching here is city
        System.out.println("INDEX = " + index);
    }

    @Test
    void testCopyOfRange() {
        printArray(cities, "List of cities as is ");
        City[] citiesCopyRange = Arrays.copyOfRange(cities, 3, cities.length);
        printArray(citiesCopyRange, "Cities Copy of Range from 3 to last");
    }

    @Test
    void testSystemArrayCopy() {
        printArray(cities, "LIST OF CITIES AS IS");
        City[] citiesCopy = new City[cities.length * 3];
        //This line creates a new array citiesCopy of type City[].
        //The size of citiesCopy is cities.length * 2, which means it will be twice the length of the cities array.
        System.arraycopy(cities, 2, citiesCopy, 4, cities.length - 3);
        // cities: Source array from which elements are copied.
        // 1: Starting position in the cities array from where elements are copied.
        // citiesCopy: Destination array where elements are copied.
        // 4: Starting position in the citiesCopy array where elements are copied to.
        // cities.length - 2: Number of elements to be copied from cities to citiesCopy.

        printArray(citiesCopy, "System.arraycopy");
    }

    @Test
    void testArrayCopy() {
        City[] citiesCopy = Arrays.copyOf(cities, cities.length * 2);
        printArray(citiesCopy, "City before sorting");
        Arrays.sort(cities);
        printArray(cities, "citiesCopy after sort by NAME");
        System.out.println("==========================================================");
        //Comparator<City> comparator= (c1, c2) -> c1.getName().compareTo(c2.getName());
        //Arrays.sort(citiesCopy, 0, cities.length, comparator);
        //printArray(citiesCopy, "CitiesCopy sort by Name");
        //System.out.println("========================================");
        City newCity = new City("Dubai", 0, "0", 0); // it would be on the 6th postion or index5
        int index = Arrays.binarySearch(citiesCopy, 0, cities.length, newCity);
        System.out.println("City: " + newCity.getName() + ", index = " + index);

    }

    @Test
    void testKeepSorting() {
        Arrays.sort(cities);
        printArray(cities, "Native order(Name of the cities)");
        City city = new City("Tokio", 690000, "USA", 1);
        City[] citiesCopy = Arrays.copyOf(cities, cities.length + 1); // copy of array with the lenght + 1
        int index = Arrays.binarySearch(citiesCopy, 0, citiesCopy.length - 1, city);
        index = index >= 0 ? index : -index - 1; // obrabotali poluchennij index
        System.arraycopy(citiesCopy, index, citiesCopy, index + 1, citiesCopy.length - index - 1);
        // vuschislyjem dlinu hvosta kotoruju hotim perenesti - rasdvigali massiv
        citiesCopy[index] = city; // we put the element on the required place
        cities = citiesCopy;
        printArray(cities, "Added city and array keep sorting");
    }
}

