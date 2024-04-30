package homework;

//Task 2. Enter a positive integer, find the sum of its digits.

import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer number: ");
        int number = scanner.nextInt();

        while(number <=0) {
            System.out.println("Wrong input! Try again");
            number =scanner.nextInt();
        }

        int originalNumber = number;
        int sumOfDigits = 0;


        while (number > 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            //a shorthand notation that is equivalent to sumOfDigits = sumOfDigits + digit;
            number = number/10;
        }
        System.out.println("The sum of the digits of the original number: " + originalNumber + " will be " + sumOfDigits);

    }
}
