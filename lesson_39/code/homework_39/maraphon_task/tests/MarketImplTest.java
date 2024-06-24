package homework_39.maraphon_task.tests;

import homework_35.books.Book;
import homework_39.maraphon_task.dao.MarketImpl;
import homework_39.maraphon_task.dao.SuperMarket;
import homework_39.maraphon_task.model.Food;
import homework_39.maraphon_task.model.MeatFood;
import homework_39.maraphon_task.model.MilkFood;
import homework_39.maraphon_task.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class MarketImplTest {
    SuperMarket superMarket;
    Product[] products;

    @BeforeEach
    void setUp() {
        superMarket = new MarketImpl(5);
        products = new Product[4];
        products[0] = new MeatFood(1, 6.5, "Steaks", "2024-06-22", 1003L, "Puten");
        products[1] = new Food(2, 2, "Avocado", "2024-06-22", 1000L, "healthy");
        products[2] = new Food(3, 1.80, "Chocolate", "2024-07-19", 1002L, "sweets");
        products[3] = new MilkFood(4, 0.95, "Milk", "2024-06-29", 1004L, "cow", 1.5);
        for (Product product : products) {
            superMarket.addProduct(product);
        }
    }

    @Test
    void addProduct() {
        assertFalse(superMarket.addProduct(null));
        assertFalse(superMarket.addProduct(products[2]));
        Product product = new Food(5, 15, "Salmon", "2024-06-24", 1005L, "fish");
        assertTrue(superMarket.addProduct(product));
        assertEquals(5, superMarket.quantity());
        Product productOneMore = new Food(6, 10, "Tuna", "2024-06-24", 1006L, "fish");
        assertFalse(superMarket.addProduct(productOneMore));
    }

    @Test
    void removeProduct() {
        assertEquals(products[3], superMarket.removeProduct(4));
        assertEquals(3, superMarket.quantity());
    }

    @Test
    void findProduct() {
        assertEquals(products[2], superMarket.findProduct(3));
        assertNull(superMarket.findProduct(7));
    }

    @Test
    void findProductByExpDate() {
        assertEquals(products[2], superMarket.findProductByExpDate("2024-07-19"));
        assertNull(superMarket.findProductByExpDate("2025-07-02"));
    }

    @Test
    void quantity() {
        assertEquals(4, superMarket.quantity());
    }

    @Test
    void printProduct() {
        superMarket.printProduct();
    }

    private void printArray(Object[] arr, String reportTitle){
        System.out.println("======" + reportTitle + "=======");
        for (Object o : arr) {
            System.out.println(o);
        }
    }
    @Test
    void testPrint(){
        printArray(products, "List of our products that we placed in our setUp method");
    }

    @Test
    void testNativeSorting(){
        printArray(products, "List of our products that we placed in our setUp method");
        Arrays.sort(products); // native sorting
        printArray(products, "List of products sorted by date of expiry");
    }

    @Test
    void testComparator(){
        printArray(products, "Before sorting");
        Arrays.sort(products); // native sorting
        printArray(products, "After sorting by date of expiry");

    }
}