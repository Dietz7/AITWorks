package homework;

import java.util.Scanner;

public class MonthQuarter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of month : ");
        int month = scanner.nextInt();

        switch (month) {
            case 1,2,3 -> System.out.println("This month belongs to the quarter number 1");
            case 4,5,6 -> System.out.println("This month belongs to the quarter number 2");
            case 7,8,9 -> System.out.println("This month belongs to the quarter number 3");
            case 10,11,12 -> System.out.println("This number belongs to the quarter number 4");
            default -> System.out.println("Invalid input");
        }
    }
}
