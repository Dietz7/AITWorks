package classwork;

import homework.ArrayMethods;

public class ArrayApplication {
    public static void main(String[] args) {

        int [] numbers = {-238,  -96,  5,  57,  -34, 77,  -76, 33, -142, -208};
        ArraysMethods.printArray(numbers);
        int max = ArraysMethods.maxOfArray(numbers);
        System.out.println("Max of array: " + max);
        int maxIndex = ArraysMethods.indexMaxOfArray(numbers);
        System.out.println("Index Max of Array: " + maxIndex);

        String [] dayOfWeek = {"Mo", "Tu", "We", "Th", "St", "Su"};
        ArraysMethods.printArray(dayOfWeek);

        ArraysMethods.bubbleSort(numbers);
        ArraysMethods.printArray(numbers);

    }

}
