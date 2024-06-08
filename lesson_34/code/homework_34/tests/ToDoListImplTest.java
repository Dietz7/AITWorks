package homework_34.tests;

import homework_34.model.Task;
import homework_34.dao.ToDoListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListImplTest {
    private ToDoListImpl toDoList;

    @BeforeEach
    void setUp() {
        toDoList = new ToDoListImpl(5);
    }
    @Test
    void addNote() {
        Task task1 = new Task(0, "Finishing homework");
        toDoList.addNote(task1);
        List<Task> tasks = toDoList.seeAllNotes();
        System.out.println(toDoList.seeAllNotes());
        assertEquals(1, tasks.size());
        assertEquals("Finishing homework", tasks.get(0).getTask());
    }

    @Test
    void deleteNote() {
        toDoList.addNote("Finishing homework");
        toDoList.addNote("Meeting with Mama");
        toDoList.addNote("Spending time with husband");
        toDoList.deleteNote(1);
        List<Task> tasks = toDoList.seeAllNotes();
        assertEquals(2, tasks.size());
        assertEquals("Meeting with Mama", tasks.get(0).getTask());
        assertEquals("Spending time with husband", tasks.get(1).getTask());
        System.out.println(tasks);
    }

    @Test
    void editNote() {
        toDoList.addNote("Meeting with Mama");
        System.out.println(toDoList.seeAllNotes());
        toDoList.editNote(1, "Drinking a coffee with Mama");
        List<Task> tasks = toDoList.seeAllNotes();
        assertEquals(1, tasks.size());
        assertEquals("Drinking a coffee with Mama", tasks.get(0).getTask());
        System.out.println(toDoList.seeAllNotes());
    }
}