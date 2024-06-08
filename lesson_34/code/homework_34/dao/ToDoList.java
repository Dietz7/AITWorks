package homework_34.dao;

import homework_34.model.Task;

import java.util.List;

//our interface ToDoList defines the CONTRACT for a ToDoList, including methods for adding,
//viewing, deleting, and editing notes*/

public interface ToDoList {
    void addNote(Task task); //This method takes a Task OBJECT as a parameter.
    //It allows adding a pre-existing Task OBJECT to the list.
    //The Task object should already have its FIELDS (like id and task content) set before being passed to this method.
    void addNote(String note); // This method takes a String as a parameter.
    // It allows adding a new task directly by specifying the task content as a string.
    // Inside this method, a new Task OBJECT is created using the provided string.
    List<Task> seeAllNotes();
    void deleteNote(int taskNumber);
    void editNote(int taskNumber, String newTask);
}

