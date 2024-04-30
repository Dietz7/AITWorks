package homework;
/*Task 1. Specify an array of 10 random natural numbers in the range from -20 to 20. Ask the user
for some natural number. Determine if this number is in the array. Create and use a method
searchInArray, which receives an array and the searched number as input, and returns the answer
is whether this number was found in the array.
 */
import java.util.Scanner;

import static classwork.ArrayAppl.fillArray;

public class SearchNumInArray {
    public static void main(String[] args) {
        int [] arr = new int [10];
        printArray(arr);
        fillArray(arr, -20, 20);
        printArray(arr);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        int value = scanner.nextInt();
        boolean inRange = searchInArray(arr, value);
        System.out.println("Is the given number in the defined range?: " + " " + inRange);

    } // end of main

    private static boolean searchInArray (int [] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if(arr [i] == value) {
                return true;
            }
        }
        return false;
    }

    public static void fillArray(int [] arr, int a, int b) {
        for (int i = 0; i < arr.length; i++) {
            arr [i] = (int) (Math.random() * (b - a + 1) + a) ;
        }
    }

    public static void printArray (int [] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr [i] + "\t");
    }
    System.out.println();
}
} // end of class