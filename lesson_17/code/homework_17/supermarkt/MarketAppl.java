package homework_17.supermarkt;

import homework_17.supermarkt.model.child.Food;
import homework_17.supermarkt.model.child.MeatFood;
import homework_17.supermarkt.model.child.MilkFood;
import homework_17.supermarkt.model.parent.Product;

public class MarketAppl {
    public static void main(String[] args) {
        Product[] products = new Product[4];

        products[0] = new Product(50, "Gift card", 1000L);
        products[1] = new Food(30, "Avakado", 1001L, "2024-04-15");
        products[2] = new MeatFood(20, "Sosages", 1002L, "2024-04-10", "biff");
        products[3] = new MilkFood(3, "Milk", 1003L, "2024-04-05", "cow", 3.5);

        System.out.println("==========All products============");
        printProducts(products);

        System.out.println("==========Sum of price============");
        double totalPrice = getTotalPrice(products);
        System.out.println("Total price of products = " + totalPrice);

        System.out.println("==========Not Food products=========");
        printNotFoodProducts(products);

        System.out.println("==========Find by barcode============");
        Product product = findByBarCode (products,1001L);
        System.out.println(product);

    } // end of main

    private static Product findByBarCode(Product[] products, long barCode) {
        Product prod = null;
        for (int i = 0; i < products.length ; i++) {
            if(products[i].getBarCode() == barCode) {
             prod = products [i];
             break;
            }
        }
        return prod;
    }

    private static void printNotFoodProducts(Product[] products) {
        for (int i = 0; i < products.length; i++) {
           if(!(products [i] instanceof Food))  {
               System.out.println(products[i]);
           }
        }
    }

    private static double getTotalPrice(Product[] products) {
        double res = 0;
        for (int i = 0; i < products.length ; i++) {
           res+=products[i].getPrice();
        }
        return res;
    }

    private static void printProducts(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            System.out.println(products [i]);
        }
    }


} // end of class

