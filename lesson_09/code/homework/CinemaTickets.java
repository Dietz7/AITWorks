package homework;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our Cinema!");
        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        System.out.println("Are you a student? Please use true or false instead of yes and no");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Do you want a VIP seat? Please use true or false instead of yes and no");
        boolean isVip = scanner.nextBoolean();
        double ticketPrice = calculateTicketPrice(age, isStudent, isVip);
        System.out.printf("Total ticket price: %.2f", ticketPrice);
        System.out.println();
    }

    public static double calculateTicketPrice(int age, boolean isStudent, boolean isVip) {
        double standardPrice = 20.0;
        double studentDiscount = 0.1; // 10%
        double seniorDiscount = 0.25; // 25%
        double vipSurcharge = 0.25;   // 25%

        double discountedPrice = 0.0;

        if (age < 18) {
            discountedPrice = isStudent ? standardPrice * (1 - studentDiscount) : standardPrice;
        } else if (age >= 18 && age < 65) {
            discountedPrice = isStudent ? standardPrice * (1 - studentDiscount) : standardPrice;
        } else if (age >= 65) {
            discountedPrice = isStudent ? standardPrice * (1 - studentDiscount - seniorDiscount) : standardPrice * (1 - seniorDiscount);
        }
        if (isVip) {
            discountedPrice *= (1 + vipSurcharge);
        }

        return discountedPrice;
    }
}
