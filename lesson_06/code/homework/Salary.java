package homework;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        double baseSalary = 500.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of years");

        int years = scanner.nextInt();

        double bonus = 0.0;
        if (years <= 0) {
            System.out.println("Sorry, you must work for us before you get money");
        } else {

            if (years >= 3 & years < 5) {
                bonus = 10.0;
            }
            if (years >= 5 & years < 10) {
                bonus = 50.0;
            }
            if (years >= 10 & years < 15) {
                bonus = 100.0;
            }
            if (years >= 15) {
                bonus = 150.0;
            }

            double bonusAmount = (bonus / 100) * baseSalary;
            double totalSalary = baseSalary + bonusAmount;
            System.out.printf("The final salary is :  $%.2f%n", totalSalary);


        }
    }

    }

