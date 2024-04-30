package homework;
/*Task 3. Determining the time of day. Write a program that takes the current hour (0 to 23)
and displays a greeting depending on the time of day (morning, afternoon, evening, night).
 */

import java.util.Scanner;

public class TimeOfDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the current hour (0 to 23)");
        int time = scanner.nextInt();

        if(time >= 0 && time < 6) {
            System.out.println("Good night and sweet dreams!");
        } else if (time < 12) {
            System.out.println("Good morning! Wish you a wonderful day!");
        } else if (time < 18) {
            System.out.println("Good afternoon!");
        } else {
            System.out.println("Good evening");
        }

    }
}
