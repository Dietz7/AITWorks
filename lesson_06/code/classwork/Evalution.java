package classwork;/*- Задание 2.
Родители позволяют ребенку играть на компьютере 1 час.
напишите программу, которая будет реагировать на полученную в школе оценку:
1. "Молодец!", время для игр на компьютере увеличивается на 30 мин.
2. "Хорошо", ты можешь играть на компьютере обычные 60 минут.
3. "Посредственно.", время для игр уменьшается на 30 мин.
4. "Плохо!", сегодня никаких игр на компьютере.
5. "Позор семьи!", никаких игр на компьютере 2 дня. */


import java.util.Scanner;




public class Evalution {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println(" Which mark have you got today?");
        int mark = scanner.nextInt(); // poluchajem otvet s klaviaturu

        int timeForGame = 60;

        switch (mark) {
            case 1: {
                System.out.println("Well done!");
                timeForGame = timeForGame  + 30;
                System.out.println("Time for game: " + timeForGame);
                break;
            }
            case 2: {
                System.out.println("Good");
                System.out.println("Good " + timeForGame);
                break;
            }
            case 3: {
                timeForGame = timeForGame - 30;
                System.out.println("Not so good" +timeForGame);
                break;
            }
            case 4: {
                System.out.println("Very bad");
                timeForGame = 0;
                System.out.println("No game today");
                break;
            }
            default: {
                System.out.println("Wrong input");
            }
        }

    }
}
