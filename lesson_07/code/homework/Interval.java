package homework;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {

        // create Scanner and prompt the user to enter a number

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        double number = scanner.nextDouble();
        //define the interval [0, 11]
        double a = 0;
        double b = 11;

        //call the Method NumberInInterval

        if (NumberInInterval(number, a, b)) {
            System.out.println("The number is within a given interval [" + a + ", " + b + "]");
        } else {
            System.out.println("The number is outside of the given interval [" + a + ", " + b + "]");
        }

    }
       // define the method NumberInInterval, which returns true if the number is within
       // the interval [a, b], and false otherwise
    private static boolean NumberInInterval(double number, double a, double b) {
        return number >=a && number <=b;
    }

}
