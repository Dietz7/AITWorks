package homework_34;

import java.util.ArrayList;
import java.util.List;

public class ToDoListImpl implements ToDoList {
    private List<Task> tasks = new ArrayList<>();
    private int taskCounter = 1;


    @Override
    public void addNote(Task task) {
        task.setTaskNumber(taskCounter++);
        tasks.add(task);
    }

    @Override
    public List<Task> seeAllNotes() {
        return new ArrayList<>(tasks);
    }

    @Override
    public void deleteNote(int taskNumber) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getTaskNumber() == taskNumber) {
                tasks.remove(i);
                break;
            }
        }
    }

    @Override
    public void editNote(int taskNumber, String newTask) {
        for (Task task : tasks) {
            if (task.getTaskNumber() == taskNumber) {
                task.setTask(newTask);
                return;
            }
        }
    }

}

