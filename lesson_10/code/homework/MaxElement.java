package homework;

public class MaxElement {
    public static void main(String[] args) {
        int [] myArray = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};
        int max = myArray [0];
        int indexMax = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray [i] > max) {
               max = myArray [i];
               indexMax = i;
            }
        }
        System.out.println("Max age = " + max);
        System.out.println("Index of max element: " + indexMax);
    }
}
