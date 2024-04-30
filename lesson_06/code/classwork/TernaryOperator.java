package classwork;
/*числа.
Найдите минимальное из них с помощью тернарного оператора.
Дополните программу возможностью ввода чисел пользователем.*/

import java.util.Scanner;



public class TernaryOperator {
    public static void main(String[] args) {
        int a = 0;
        int b = -85;


        Scanner scanner = new Scanner (System.in); // vkluchili scanner

        System.out.println("Input 1st number"); // priglashenie polzovatelju

        a = scanner.nextInt(); // poluchaem znachenie s klaviatutu
        System.out.println("Input 2st number"); // priglashenije polzovatelji
        b = scanner.nextInt(); // poluchaem znachenie s klaviatutu

        int min = (a < b) ? a : b; // esla a mensche b to prisvajivaem a libo b

        System.out.println("Minimum: "+ min);

    }
}
