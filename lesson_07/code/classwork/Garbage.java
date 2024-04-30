package classwork;
/*Запрограммировать бот, который помогает выбрасывать мусор в баки разных цветов:
        - упаковки в желтый бак
- пищевые отходы в коричневый бак
- бумага в зеленый бак
- прочие отходы в черный бак*/

import java.util.Scanner;

public class Garbage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input type of garbage: ");
        String garbage = scanner.nextLine();


        switch (garbage){
            case "paper" -> System.out.println("Put it in green box");
            case "plastic" -> System.out.println("Put it in yellow");
            case "food", "bio" -> System.out.println("Put it in brown");
            case "other", "rest", "metal" -> System.out.println("Put it in black box");
            default -> System.out.println("Please, use paper, plastic, food, bio, other, rest, metal. Save the planet");

        }

    }
}
