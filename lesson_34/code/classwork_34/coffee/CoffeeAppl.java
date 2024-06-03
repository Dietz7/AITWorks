package classwork_34.coffee;

import java.util.Scanner;

public class CoffeeAppl {
    public static void main(String[] args) {
        System.out.println("Welcome to ourCoffeeShop!");

        Coffee [] menu = Coffee.values();
        // print menu
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + 1 + " - " + menu[i].getName());
        }

        Scanner scanner = new Scanner(System.in);

        while(true) {
        System.out.println("Input your choice"); // user invitation
        int choice = scanner.nextInt();


            switch (choice) {
                case 1 ->
                        System.out.println("Here you are: " + menu[choice - 1].getName() + ", price: " + menu[choice - 1].getPrice());
                case 2 ->
                        System.out.println("Here you are: " + menu[choice - 1].getName() + ", price: " + menu[choice - 1].getPrice());
                case 3 ->
                        System.out.println("Here you are: " + menu[choice - 1].getName() + ", price: " + menu[choice - 1].getPrice());
                case 4 ->
                        System.out.println("Here you are: " + menu[choice - 1].getName() + ", price: " + menu[choice - 1].getPrice());
                default -> System.out.println("Wrong choice");
            }
        }

    } // how to stop cycle while
}
