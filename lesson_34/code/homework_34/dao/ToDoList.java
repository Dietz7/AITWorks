package homework_34;

import java.util.List;

public interface ToDoList {
    void addNote(Task task);
    void addNote(String note);
    List<Task> seeAllNotes();
    void deleteNote(int taskNumber);
    void editNote(int taskNumber, String newTask);
}
