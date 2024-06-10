package homework_32;

import homework_32.dao.StockImpl;
import homework_32.model.Computer;
import homework_32.model.Laptop;
import homework_32.model.Smartphone;

public class StockAppl {
    public static void main(String[] args) {
        // we are initializing our stock with a capacity 5
        StockImpl stock = new StockImpl(5); //we have created STOCK based on the class StockImpl
        Computer[] comp = new Computer[4];
        comp[0] = new Computer("Asus", "i5", 256, 1200, true, 1234567);
        comp[1] = new Computer("HP", "i6", 512, 1600, false, 7654321);
        comp[2] = new Laptop("Lenovo", "i7", 128, 1800, true, 4444444,
                15, 6);
        comp[3] = new Smartphone("Iphone", "i6", 6, 1000, true, 7777777,
                5.6, 10, "iOS");

        // now we should add computers
        for (Computer c : comp) {
            stock.addComputer(c);
        }
        // we want to print our added computers
        stock.printComputer();
        System.out.println("-----------------------------");

        // find computer with serial number 1234567
        Computer computer = stock.findComputer(1234567);
        System.out.println(computer);
        // find computer with discount
        System.out.println("-------------------------------------------\n");
        Computer computer1 = stock.findWithDiscount(7654321);
        System.out.println(computer1); // null because  this computer has no discount
        Computer computer2 = stock.findWithDiscount(1234567);
        System.out.println(computer2);
        System.out.println("=========List after removing one of our computers===============\n");
        stock.removeComputer(7777777);
        stock.printComputer();
        System.out.println(stock.quantity());

    }

}
