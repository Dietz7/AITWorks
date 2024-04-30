package homework;
// Task 1. The program receives as input a string and the number of repetitions of this string.
// The program should print this string required number of times.

import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your string : ");
        String inputString = scanner.nextLine(); // reads the entire line of text entered by the user
        System.out.println("Enter the number of repetitions of your string");
        int q = scanner.nextInt();
        int count = 0;  // Initialize a counter variable

        // Use a while loop to print the string the specified number of times
        while (count < q ) {
            System.out.println(inputString);
            count++;
        }
        System.out.println("End");
    }

}
