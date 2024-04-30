package classwork;
/* - печатает переданный в метод массив
- заполняет переданный в метод массив случайными целыми числами в интервале от А до В
- меняет указанные по индексам два элемента массива местами
- находит элемент массива по индексу
- находит максимальный элемент массива
- печатает переданный в метод массив
- заполняет переданный в метод массив случайными целыми числами в интервале от А до В
- меняет указанные по индексам два элемента массива местами
- находит элемент массива
- находит максимальный элемент массива */

public class ArrayAppl {
    public static void main(String[] args) {
        int [] arr = new int[10];
        printArray(arr); //related to first Action (method)
       fillArray(arr, 1, 10); // we put these numbers ourselves (index of elements), related to the 2nd Action(Method)
        printArray(arr);

        swapElements(arr, 0, arr.length - 1);// first and last
        printArray(arr); //related to the 3rd method

        swapElements(arr, 2, 8);
        printArray(arr);

        int res = searchByValue(arr, 5); // nuzhno skatat chto mu prinimajem etot
        System.out.println("Index = " + res);

        int index = maxOfArray(arr); // nuzhno peremennju index chtobu vuzvat method5
        System.out.println("index of max element = " + index);



    } // end of main

    // max element 5th method
    public static int maxOfArray(int[] arr) {
        int max = arr[0]; // search max element
        int indexMax = 0; // search max index better index max to find than index value
        for (int i = 0; i <arr.length; i++) {
            if(arr[i] > max) {
              max = arr[i];
              indexMax = i;
            }
        }
        return indexMax;
    }

    // search in array by value

    public static int searchByValue (int[] arr, int value) { //4st Method returns the element, no void
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == value){
                return i;
            }
        }
        return -1; // if nothing was found then write -1; this is a rule among developers
    }

    // swap element - 3rd Action method
    public static void swapElements(int[] arr, int m, int n){
        int tmp = arr[m];
        arr[m] = arr[n];
        arr[n] = tmp; // in main call this method


    }

    // fill array with random numbers - 2nd Action

    public static void fillArray(int[] arr, int a, int b) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (b - a + 1));
        }

    }

    // print array First Action
    public static void printArray(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

} // end of class
