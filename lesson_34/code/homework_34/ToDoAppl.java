package homework_34;

import java.util.Scanner;

public class ToDoAppl {
    Task[] tasks;
    private static ToDoList toDoList = new ToDoListImpl();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        System.out.println("Welcome to the To-Do List application");

        while (running) {
            MenuAction.printMenu();
            System.out.println("Please choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("PLease enter your note: ");
                    String note = scanner.nextLine();
                    toDoList.addNote(new Task(0, note, 0));
                    break;
                case 2:
                    System.out.println("All notes:");
                    toDoList.seeAllNotes().forEach(System.out::println);
                    break;
                case 3:
                    System.out.print("Enter the task number to delete: ");
                    int taskNumberToDelete = scanner.nextInt();
                    toDoList.deleteNote(taskNumberToDelete);
                    break;
                case 4:
                    System.out.print("Enter the task number to edit: ");
                    int taskNumberToEdit = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter the new note: ");
                    String newNote = scanner.nextLine();
                    toDoList.editNote(taskNumberToEdit, newNote);
                    System.out.println("The note has been successfully edited");
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


