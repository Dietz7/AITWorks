package classwork;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        // create array

        int a = -10;
        int b = 10;
        int [] numbers = new int [10];
        ArraysMethods.fillArray(numbers, a, b);
        ArraysMethods.printArray(numbers);

        // sorting of array

        ArraysMethods.bubbleSort(numbers);
        ArraysMethods.printArray(numbers);
        // binary search

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your number: ");
        int num = scanner.nextInt();

        int index = ArraysMethods.binarySearch(numbers, num);
        System.out.println("Index = " + index);

    }

}
