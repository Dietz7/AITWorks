package homework;


import java.util.Random;

public class ArrayMethods {
    public static void main(String[] args) {
        Random random = new Random(); //creates object for generating random numbers

        //specify an array of 10 random numbers in the range from -10 to 10
        int [] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(21) - 10;
            //генерирует случайное целое число в диапазоне от 0 (включительно) до 21 (исключительно).
            //Вычитание 10 используется для сдвига диапазона от [0, 21) до [-10, 10).
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums [i] + " ");
        }
        System.out.println();
        System.out.println("Sum of odds elements is: " + sumOfOddElements(nums));

        reverseArray(nums);
        for (int i = 0; i < nums.length ; i++) {
            System.out.print(nums [i] + " ");
        }

        System.out.println();
        System.out.println("Multiplication of elements with even indexes is:  " + multOfEvenInd(nums));

    } // end of main

    public static void reverseArray (int [] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length/2; i++) {
            temp = nums [i];
            nums [i] = nums [nums.length -1 - i];
            nums [nums.length - 1 - i] = temp;
        }
    }
    public static int multOfEvenInd (int [] nums) {
        int res = 1;
        for (int i = 0; i <nums.length ; i++) {
            if(i % 2 == 0) {
                res*= nums[i];
            }
        }
        return res;
    }

    public static int sumOfOddElements (int [] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
          if (nums[i] % 2 != 0){
              sum+= nums[i];
          }
        }
        return sum;
    }


}
