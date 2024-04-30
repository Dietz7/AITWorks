package homework;

import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side A of the triangle: ");
        int a = scanner.nextInt();
        System.out.println("Enter the side B of the triangle: ");
        int b = scanner.nextInt();
        System.out.println("Enter the side C of the triangle");
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println("This is an equilateral triangle");
        } else if (a == b || a == b || b == c) {
            System.out.println("This is an isosceles triangle");
        } else {
            System.out.println("This is a scalene triangle");
        }
    }
}



