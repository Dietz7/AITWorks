package homework;
//Set an array of random integers. Implement a method that receives an array as input and sorts it
// using the selection sort algorithm.

import classwork.ArraysMethods;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[10];
        int a = 0;
        int b = 10;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (b - a + 1) + a);
            System.out.print(array[i] + " ");
        }

        SelectionSort(array);
        System.out.println("\nSorted array:");
        for (int i = 0; i < array.length; i++) {
            int num = array [i];
            System.out.print(num + " ");
        }


    } // end of main
    public static void SelectionSort (int [] array) {
        int n = array.length;
        for (int i = 0; i < n- 1; i++) {
            int MinInd = i;
            for (int j = i + 1; j < n; j++) {
              if (array [j] < array [MinInd]) {
                MinInd = j;
              }
            }
          int temp = array[MinInd];
            array [MinInd] = array [i];
            array [i] = temp;
        }
    }

} // end of class