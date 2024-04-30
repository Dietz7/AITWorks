package classwork;
// Создать массив из 20 случайных целых чисел в интервале от -100 до 100.
//Сколько в нем получилось отрицательных чисел?
//Сформируйте из них новый массив.

public class FindInArray {
    public static void main(String[] args) {

        int [] array = new int [20];
        int a = -100;
        int b = 100;

        ArraysMethods.fillArray(array, a,b);
        ArraysMethods.printArray(array);
        // step 1 - count result
        int count = countNegativeElementsInArray(array);
       // step 2 - create new array and move negative numbers to the new array

        int [] newArray = new int[count];
        fillNewArray(array, newArray);
        ArraysMethods.printArray(newArray);

    } // end of class

    private static void fillNewArray(int[] array, int[] newArray) {
        for (int i = 0, j = 0; j < newArray.length; i++) { // cycke in cycle
            if(array [i] < 0){
            newArray [j++] = array [i]; // libo nizhe j++;
            }
        }
    }

    private static int countNegativeElementsInArray(int[] array) {
        int count = 0;
        for (int i = 0; i <array.length; i++) {
            if(array[i] < 0) {
              count++;
            }
        }
         return count;
    }


}
