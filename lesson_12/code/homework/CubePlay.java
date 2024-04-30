package homework;

import classwork.ArraysMethods;

public class CubePlay {
    public static void main(String[] args) {

        int [] cube = new int [20];
        int a = 1; // minimum value of the range of numbers
        int b = 6; // maximum value of the range of numbers
        for (int i = 0; i < cube.length; i++) {
            cube [i] = (int) (Math.random() * (b - a + 1) + a);
        }
        for (int i = 0; i < cube.length ; i++) {
            System.out.print(cube [i] + "   ");
        }
        System.out.println();

        int count [] = new int [b - a + 1]; // initialize an array to store the counts
        for (int i = 0; i < cube.length; i++) {
            int index = cube [i] - a; // // calculate the index for the current number
            count [index]++; // increment the count for the corresponding number
        }

        System.out.println("Results of rolls");
        for (int i = 0; i < count.length; i++) {
            double probability = (double) count[i] / cube.length;
            // i + a represents the current side number
            System.out.printf("Side %d: Count = %d, Probability = %.2f\n", i + a, count[i], probability);
        }
    }
}
