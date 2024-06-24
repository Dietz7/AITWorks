package homework_39.maraphon_task;

import homework_39.maraphon_task.dao.MarketImpl;
import homework_39.maraphon_task.model.Food;
import homework_39.maraphon_task.model.MeatFood;
import homework_39.maraphon_task.model.MilkFood;
import homework_39.maraphon_task.model.Product;

public class MarketAppl {
    public static void main(String[] args) {
        MarketImpl superMarket = new MarketImpl(5); // we have created object SUPERMARKET based on the class MarketImpl
        Product[] products = new Product[4];
        products[0] = new Food(1, 2, "Avocado", "2024-06-21", 1000L, "healthy");
        products[1] = new Food(2, 1.80, "Chocolate", "2024-07-19", 1002L, "sweets");
        products[2] = new MeatFood(3, 6.5, "Steaks", "2024-06-22", 1003L, "Puten");
        products[3] = new MilkFood(4, 0.95, "Milk", "2024-06-29", 1004L, "cow", 1.5);

        for (Product product : products) {
                superMarket.addProduct(product);

        }

        superMarket.printProduct();
        System.out.println("==========================================================================");

        double totalCost = superMarket.getTotalCost();
        System.out.println(totalCost);

    }

}
