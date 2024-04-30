package homework;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What will you choose? Red? Yellow? Green?");
        String colour = scanner.next();

        switch (colour) {
            case "Red" -> System.out.println("STOP, do not think that you can run a red light");
            case "Yellow" -> System.out.println("Okay, you can now prepare yourself for driving");
            case "Green" -> System.out.println("Finally, you can drive, but be careful please!");
            default -> System.out.println("Oops");
        }

    }
}
