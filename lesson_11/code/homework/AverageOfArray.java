package homework;
//Task 2. Write a method that accepts an array of integers and returns the arithmetic mean all
// its elements.

public class AverageOfArray {
    public static void main(String[] args) {
    int [] arr = {11, 22, 33};
        double value = calculateAverage (arr);
        System.out.printf("The average of elements %.2f",  value);
    }

    private static double calculateAverage(int[] arr) {
        if (arr.length ==0) {
            System.out.println("The average of elements cannot be calculated");
            return 0.0;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
           sum+= arr[i];
        }
        double value = (double) sum / arr.length;
        return value;
    }
}
