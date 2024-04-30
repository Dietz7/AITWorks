package classwork;
//Пользователь вводит с клавиатуры строку.
//Распечатайте каждую букву строки на новой строчке.
//Используйте методы length и charAt() класса String.


import java.util.Scanner;

public class LettersInString {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: ");

        String str = scanner.nextLine();
        int l = str.length(); // length of the line
        int count = 0;

        while (count < l) {
            System.out.println(str.charAt(count));
            count++;
        }
    }
}
