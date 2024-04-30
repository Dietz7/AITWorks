package homework;

import java.util.Scanner;

public class Taxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your month income");
        double income = scanner.nextDouble();

        if (income <= 10000){
            System.out.println("Taxes = " + income * 0.1);
        } else if (income >= 10001 && income <= 20000) {
            System.out.println("Taxes = " + income * 0.2);
        } else {
            System.out.println("Taxes = " + income * 0.3);
        }
    }
}
