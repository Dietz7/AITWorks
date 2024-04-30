package homework;

import java.util.Scanner;

public class PairMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter a pair of integers separated by a space\n");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int max = (num1 > num2) ? num1 : num2;
            System.out.println("Maximum number is : " + max);
        }

    }

}
