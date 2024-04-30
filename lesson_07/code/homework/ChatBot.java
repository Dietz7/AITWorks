package homework;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Nice to meet you," + name + "!" + " " + "My name is Bot1.");

        System.out.println("What is your weight?");
        int weight = scanner.nextInt();
        if (weight > 100) {
            System.out.println("This weight is a bit excessive");
        } else {
            System.out.println("You are in good physical shape");
        }
        System.out.println("What is your height?");
        int height = scanner.nextInt();
        if (height > 150) {
            System.out.println("You are among the majority");
        } else {
            System.out.println("You among the minority");
        }
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        if(age > 60){
            System.out.println("You are wise enough and can really enjoy your life without stress");
        } else {
            System.out.println("You will be wiser soon");
        }

        System.out.println("Thank you and have a nice day!");
    }
}

