package homework_32.tests;

import homework_32.dao.Stock;
import homework_32.dao.StockImpl;
import homework_32.model.Computer;
import homework_32.model.Laptop;
import homework_32.model.Smartphone;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static classwork.ArrayAppl.printArray;
import static org.junit.jupiter.api.Assertions.*;

class StockImplTest {
    Stock stock;
    Computer[] computers;

    @BeforeEach
    void setUp() {
        stock = new StockImpl(5);
        computers = new Computer[4];

        computers[0] = new Computer("Asus", "i5", 256, 1200, true, 1234567);
        computers[1] = new Computer("HP", "i6", 512, 1600, false, 7654321);
        computers[2] = new Laptop("Lenovo", "i7", 128, 1800, true, 4444444,
                15, 6);
        computers[3] = new Smartphone("Iphone", "i6", 6, 1000, true, 7777777,
                5.6, 10, "iOS");
        // it is necessary to add elements of array into object STOCK
        for (Computer computer : computers) {
            stock.addComputer(computer);
        }

    }

    @Test
    void addComputer() {
        // no null adding
        assertFalse(stock.addComputer(null));
        // no adding the identical computer second time
        assertFalse(stock.addComputer(computers[1]));
        Computer computer1 = new Computer("Acer", "i5", 256, 1400, false, 1234568);
        // we have created and added a new computer
        assertTrue(stock.addComputer(computer1));
        assertEquals(5, stock.quantity()); // there are 5 articles in our stock
        stock.printComputer();
        Computer computer2 = new Computer("HP", "i6", 512, 1350, false, 7654323);
        // we have created one more computer and exceeded our capacity, that is why we will be setting up a test,
        // that shows it
        assertFalse(stock.addComputer(computer2));
    }

    @Test
    void findComputer() {
        assertEquals(computers[2], stock.findComputer(4444444)); // search of the computer by serial number
        assertNull(stock.findComputer(1215146)); // search of the nonexistent computer
    }

    @Test
    void findWithDiscount() {
      assertEquals(computers[0], stock.findWithDiscount(1234567));
      assertNull(stock.findWithDiscount(7654321)); // the defined computer has no discount
      assertEquals(computers[2], stock.findWithDiscount(4444444));
      assertEquals(computers[3], stock.findWithDiscount(7777777));

    }

    @Test
    void removeComputer() {
        // now we are removing one computer
        assertEquals(computers[0], stock.removeComputer(1234567));
        assertEquals(3, stock.quantity());
        // check if we can remove the computer twice
        assertNull(stock.removeComputer(1234567));
        // test for checking if the removed computer can be found
        assertNull(stock.removeComputer(1234567));
        System.out.println("===========Demonstration of our actions from this test========");
        printComputer(); // demonstration of our actions from this test

    }

    @Test
    void quantity() {
        assertEquals(4, stock.quantity()); // intially  4 computers (in SetUpMethod)
        stock.removeComputer(1234567);
        assertEquals(3, stock.quantity());
        stock.printComputer(); // demonstration of our actions from this test

    }

    @Test
    void printComputer() {
        stock.printComputer();
    }
}
