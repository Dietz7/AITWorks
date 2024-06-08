package homework_34.dao;

import homework_34.model.Task;

import java.util.List;

public interface ToDoList {
    void addNote(Task task);
    void addNote(String note);
    List<Task> seeAllNotes();
    void deleteNote(int taskNumber);
    void editNote(int taskNumber, String newTask);
}
