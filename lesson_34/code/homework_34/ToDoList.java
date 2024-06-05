package homework_34;

import java.util.List;

public interface ToDoList {
    void addNote(Task task);
    List<Task> seeAllNotes();
    void deleteNote(int taskNumber);
    void editNote(int taskNumber, String newTask);
}
