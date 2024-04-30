package classwork;

public class ArraysMethods {
    // bubble sort
    // comparing two elements of array: array [i] ? array [i + 1]
    // if left array [i]
// fill array with random numbers
    public static void fillArray(int[] arr, int a, int b){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (b - a + 1) + a);
            System.out.print(arr [i] + " ");
        }
    }

    // binary search
    // method will return index of the found element  or otritztelnoe chislo when not found
    // peredadim v method massiv i chislo
    // method must reply if this number is in the array
    public static int binarySearch(int [] arr, int element) {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
           int mid = (left + right)/2; // mid index of the element
           if(arr[mid] == element) {
               return mid; // index of element
           } else if (element < arr [mid]) {
               right = mid - 1; // otbrosili pravuju polovinu
           } else {
               left = mid + 1; // praveje na 1
           }
        }
        return - left - 1; // when element not found
    }


    public static int [] bubbleSort (int [] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) { // pravij konets budet dvigatsa k nachalu massiva
                 if (array [j] > array [j+1]) {
                   // swap
                   int temp = array[j];
                     array[j] = array [j + 1];
                     array [j + 1 ] = temp;
                 }
            }
        }
        return array;
    }

    // print array
    public static void printArray(int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array [i] + " ");
            // print current element of array
        }
        System.out.println();
    }

    // print array String[]
    public static void printArray(String [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array [i] + " "); // print current element of array
        }
        System.out.println();
    }

    // max of element of int []
    public static int maxOfArray(int [] array) {
        int max = array [0];
        for (int i = 0; i < array.length; i++) {
            if (array [i] > max) {
               max = array [i];
            }
        }
        return max;
    }

    // Index of MAX ELEMENT

    public static int indexMaxOfArray (int []array) {
        int max =  array [0];
        int indexOfMax = array [0];
        for (int i = 0; i < array.length; i++) {
            if (array [i] > max) {
                max = array [i];
                indexOfMax = i;
            }
        }
        return indexOfMax;
    }
}
