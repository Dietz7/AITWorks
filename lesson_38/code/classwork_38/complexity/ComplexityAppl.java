package classwork_38.complexity;
//заведем простой массив целых чисел
//будем выполнять с ним различные операции:
      //  - вычисление среднего значения,
        //- поиск элемента,
//- поиск мин и макс,
//- сортировка
//оценим вычислительную сложность используемых алгоритмов

import java.util.Arrays;

public class ComplexityAppl {
    public static void main(String[] args) {
        int[] array = {12, 17, 43, 115, -28, -4, -35};

        int sum = 0;
        for (int i = 0; i < array.length; i++) { //O(n) - the number of operations increases pryamo proporzionalno kol-vu elementov
            sum += array[i];// O(1) one operation

        }
        double avg = (double) sum / array.length;
        System.out.println("Average = " + avg);
        // total Complexity: O(1) + O(n) + O(1) + O(1) = O(n)

        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(array));

        int index = Arrays.binarySearch(array, 100);
        System.out.println(index);

        // sort Array by Bubble Sort
        for (int i = 0; i < array.length - 1 ; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) { // 0(n)
                if(array[j] > array[j + 1]) { // O(1)
                    // переставим элементы местами
                    int temp = array[j]; // O(1)
                    array[j] = array[j + 1]; // O(1)
                    array[j + 1] = temp; // O(1)
                }
            }
        }

        // eto kvadratichnaja complexity O(n^2)
        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(array));
        index = Arrays.binarySearch(array, 100);
        System.out.println(index);

        index = Arrays.binarySearch(array, 115);
        System.out.println(index);

        Arrays.sort(array);// polilinejnaya complexity O(n*log())
        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(array));
    }
}
