package classwork;

//Пользователь вводит натуральное число (целое, положительное).
//Выясните, сколько цифр в числе.
// 12345678909876543  3 2 1  - input of the user: 6 digits

import java.util.Scanner;

public class DigitsInNumber {
    public static void main(String[] args) {

      // Algorithm:
      // chisla zapisivjutsa  v 10 - tischnoj sisteme schislenija, kazhdyj znak otvechaet
        // za razryad chisla
      // na kazhdom schagu delit chislo na 10 s ostatkom


     // Interaction with the user:
     // request the input number from the user
     // print number = the quantity of digits

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer and positive number: ");
        int number = scanner.nextInt();
        int count = 0;
        while ( number > 0 ) {

            number = number / 10; // delenije dajet nam skolko zifr
            count++; // uvelichivajem schetchik
        }
        System.out.println(" Number of digits are : " + count);
    }
}
