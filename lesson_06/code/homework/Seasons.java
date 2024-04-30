package homework;

import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Leonid, please enter the number of month: ");
        int month = scanner.nextInt();

        switch (month) {
            case 3,4,5 :
                System.out.println("This is Spring and you should wait a little bit for it");
                break;
            case 6,7,8 :
                System.out.println("This is summer, you can already plan your vacation");
                break;
            case 9,10,11 :
                System.out.println("This is autumn and it is very nice in Germany");
                break;
            case 12,1,2:
                System.out.println("This is winter and it is fast over!");
                break;
            default:
                System.out.println("Sorry incorrect, we have 12 months, ");

        }

    }
}
