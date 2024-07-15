package homework_20.shop;


import homework_20.shop.controller.Stock;
import homework_20.shop.model.Computer;

import java.math.BigInteger;

public class ComputerAppl {
    public static void main(String[] args) {
        Stock stock = new Stock(1000);
        stock.addComputer(new Computer("Acer", "i5", 512, new BigInteger("10000000000000000000")));
        stock.addComputer(new Computer("HP", "i6", 256, new BigInteger("20000000000000000000")));
        stock.addComputer(new Computer("Sony", "i4", 1024, new BigInteger("30000000000000000000")));

        System.out.println(stock.getSize());

        stock.addComputer(new Computer("Lenovo", "i7", 128, new BigInteger("40000000000000000000")));
        System.out.println(stock.getSize());

        stock.printComputers();

        stock.addComputer(new Computer("Asus", "i3", 64, new BigInteger("50000000000000000000")));
        stock.printComputers();
        stock.removeComputer(new BigInteger("50000000000000000000"));
        System.out.println(stock.getSize());

        stock.printComputers();
    }
    }
