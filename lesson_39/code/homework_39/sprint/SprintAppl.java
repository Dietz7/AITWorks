package homework_39.sprint;

import java.util.ArrayList;
import java.util.List;

public class SprintAppl {
    public static void main(String[] args) {
        List<SprintRunners> results = new ArrayList<>();
        results.add(new SprintRunners("Dietz", "Yuliya", 77, "Heideleberg", 9.8));
        results.add(new SprintRunners("Dorn", "Hannelore", 78, "Stuttgart", 9.6));
        results.add(new SprintRunners("Schneider", "Lisa", 79, "Hannover", 9.9));
        results.add(new SprintRunners("Müller", "Andreas", 80, "Dortmund", 8.7));
        results.add(new SprintRunners("Kleimann", "Leonid", 81, "Augsburg", 7.8));
        results.add(new SprintRunners("Schmidt", "Dieter", 82, "Köln", 8.5));
        results.add(new SprintRunners("Gärtner", "Dietmar", 83, "Ulm", 8.7));

        System.out.println();
        for (SprintRunners spr : results) {
            System.out.println(spr);
        }
    }

}

/*

        Menu[] menu = Menu.values();
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + " - " + menu[i].getAction());
        }

        while(true){
            System.out.println("Input your choice: "); // приглашение пользователю
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt(); // приняли ввод с клавиатуры

            switch (choice) {
                case 1: {
                    System.out.println("Input results ");
                    System.out.println("How many participants?");
                    int n = scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Input name: ");
                        String name =
                    }
                    break;
                }
                // раскопировать cases
                default:{
                    System.out.println("Wrong choice.");
                }
            }
        }
 */
