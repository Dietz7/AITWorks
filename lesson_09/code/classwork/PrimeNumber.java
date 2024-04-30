package classwork;
/*Пользователь вводит натуральное число n. Определите, является ли оно простым.
Простое число - это такое число, которое делится **только** на себя и на 1.
Примеры: 2, 3, 5, 7, 11, 13, 17, 19, ...
Обеспечьте защиту от ввода пользователем отрицательных чисел.*/

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer und positive number");
        int number = scanner.nextInt();

        while (number <= 0) {
            System.out.println("Wrong input!Try again.");
            number = scanner.nextInt(); // prompts the the user to try again
        }

        // the user entered the number
        //65 has entered the user, will be trying to divide 65 2,3,4,5,6...64
        // esli hot ras rasdelitsa bes ostatka, to eto budet NE PROSTOJE - PRIME Chislo
        // inache eto budet PRIME number

        boolean isPrime = true;

        int div = 2;
        while (div < number) {
            if (number % div == 0) {
                isPrime = false;
                break; // or break, so we leave the cycle because it is clear that the number not prime
            }

            div++;
        }

        System.out.println(number + " is prime: " + isPrime);
    }
}
