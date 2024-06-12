package homework_32.tests;

import homework_32.dao.Stock;
import homework_32.dao.StockImpl;
import homework_32.model.Computer;
import homework_32.model.Laptop;
import homework_32.model.Smartphone;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static classwork.ArrayAppl.printArray;
import static org.junit.jupiter.api.Assertions.*;

class StockImplTest {
    Stock stock;
    Computer[] computers;

    @BeforeEach
    void setUp() {
        stock = new StockImpl(5);
        computers = new Computer[4];

        computers[0] = new Laptop("Lenovo", "i7", 128, 1200, true, 1111111,
                10.0, 12);
        computers[1] = new Laptop("HP", "i8", 256, 1600, false, 2222222,
                0.0, 10);
        computers[2] = new Laptop("Sony", "i7", 512, 1800, true, 3333333,
                15.0, 10);
        computers[3] = new Smartphone("Iphone", "i6", 6, 1000, true, 7777777,
                10.0, 12, "iOS");

        for (Computer computer : computers) {
            stock.addComputer(computer);
        }

    }

    @Test
    void addComputer() {
        // now we are adding a new computer
        Computer newComp = new Laptop("Asus", "i9", 256, 1400, false, 4444444,
                0.0, 8);
        assertTrue(stock.addComputer(newComp));
        // adding a computer that exists - no adding must be done
        assertFalse(stock.addComputer(computers[0]));
        // adding one more computer so that we exceed our capacity
        Computer extraComp = new Laptop("Lenovo", "i5", 128, 800, false, 5555555,
                0.0, 8);
        stock.addComputer(extraComp);
        assertFalse(stock.addComputer(extraComp));

    }

    @Test
    void findComputer() {
        assertEquals(computers[2], stock.findComputer(3333333)); // search of the computer by serial number
        assertNull(stock.findComputer(0000000)); // search of the nonexistent computer

    }

    @Test
    void findWithDiscount() {
        // Verify the first computer with a discount is returned
        Computer discountComp = stock.findComputerWithDiscount();
        assertNotNull(discountComp); // Ensure that a computer with a discount is found
        assertTrue(discountComp.calcDiscount() < discountComp.getPrice());// Check if the discount
        // amount is less than the original price

        // Set discounts on multiple computers
        if (computers[3] instanceof Smartphone) {
            ((Smartphone) computers[3]).setDiscountPercentage(15.0);
            //// Set a discount for testing on the fourth computer (Smartphone)
        }
        // Verify computers with discounts
        discountComp = stock.findComputerWithDiscount();
        assertNotNull(discountComp);
        assertTrue(discountComp.calcDiscount() < discountComp.getPrice());

    }

    @Test
    void removeComputer() {
    // now we are removing one of the computers
        assertEquals(computers[0], stock.removeComputer(1111111));
        // check using quanity method if the computer was removed - by quantity(in setUp method 4 articles - 1 =3)
        assertEquals(3, stock.quantity());
        // check if we can remove the computer twice
        assertNull(stock.removeComputer(1111111));
        // test for checking if the removed computer can be found
        assertNull(stock.removeComputer(1111111));
        System.out.println("===========Demonstration of our actions from this test========");
        printComputer(); // demonstration of our actions from this test
    }

    @Test
    void quantity() {
        assertEquals(4, stock.quantity()); // intially  4 computers (in SetUpMethod)
        stock.removeComputer(7777777);
        assertEquals(3, stock.quantity());
        stock.printComputer();
    }

    @Test
    void printComputer() {
        stock.printComputer();
    }

}
