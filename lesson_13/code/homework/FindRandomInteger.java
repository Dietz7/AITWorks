package homework;
/* Заполните массив целыми числами от 1 до 100. Добавьте случайное целое число в интервале от 1 до 100
на случайное место в исходный массив.Найдите наиболее коротким способом, какое число было добавлено
в массив. */

import java.util.Random;

public class FindRandomInteger {
    public static void main(String[] args) {
        int [] array = new int [100];
        System.out.println("Original array");
        for (int i = 0; i < array.length; i++) {
            // a short way to fill the array with consecutive integers starting from 1 to 100
            array [i] = i + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        Random random = new Random();
        int randomIndex = random.nextInt(101);
        int randomNumber = random.nextInt(100) + 1;
        // Shift elements to the right to make room for the new number
        for (int i = array.length - 1; i > randomIndex; i--) {
            array[i] = array[i - 1];
        }
        array[randomIndex] = randomNumber;

        // print the array after insertion
        System.out.print("\nArray after insertion: " + " \n");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Find which number was added to the array
        int addedNumber = array[randomIndex];
        System.out.println("Added number: " + addedNumber);
        System.out.println("Inserted at index: " + randomIndex);
    }
}
