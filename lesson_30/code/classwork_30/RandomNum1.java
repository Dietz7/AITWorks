package classwork_30;
//Create an array of 20 random integers ranging from 10 to 20. Print the array.
//Swap the first and last elements of the array and print the array again.

public class RandomNum1 {
    public static void main(String[] args) {
        int [] randomNum = new int [6];

        int a = 1;
        int b = 49;
        for (int i = 0; i < randomNum.length; i++) {
            randomNum [i] = (int)(Math.random() * (b - a + 1) + a);
            // генерирует случайное целое число в интервале [a, b] a  - может быть, b  - может быть
        }

        for (int i = 0; i < randomNum.length; i++) {
            System.out.print(randomNum [i] + " | ");

        }
        int x = randomNum[0]; // Store the value of the first element in the variable x
        randomNum [0] = randomNum[randomNum.length - 1]; //// Swap the first and last elements of the array
        randomNum[randomNum.length - 1 ] = x;

        System.out.println(); // new line
        for (int i = 0; i < randomNum.length; i++) {
            System.out.print(randomNum[i] + " | ");
        }
    }
}

