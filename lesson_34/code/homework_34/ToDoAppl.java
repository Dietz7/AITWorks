package homework_34;

import homework_34.dao.ToDoList;
import homework_34.dao.ToDoListImpl;
import homework_34.model.MenuAction;
import homework_34.model.Task;

import java.util.Scanner;

public class ToDoAppl {

    Task[] tasks;

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoListImpl(5);
        int id = 0;
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        System.out.println("Welcome to the To-Do List application");

        //MAIN_CICLE:
        while (running) {
            MenuAction.printMenu();
            System.out.println("Please choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("PLease enter your note: ");
                    String note = scanner.nextLine();
                    toDoList.addNote(note);
                    break;
                case 2:
                    System.out.println("All notes:");
                    toDoList.seeAllNotes().forEach((s) -> System.out.println(s)); // lyambda
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
                    //break MAIN_CICLE;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


