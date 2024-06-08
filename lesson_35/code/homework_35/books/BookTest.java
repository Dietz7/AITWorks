package homework_35.books;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

public class BookTest {
    Book [] books;

    @BeforeEach
    void setup(){
    books = new Book [5];
        books[0] = new Book(1234567891127L, "Sunday", "John Smith", 2024);
        books[1] = new Book(1234567891124L, "Monday", "Hans Clever", 2019);
        books[2] = new Book(1234567891125L, "Saturday", "Ann Red", 2018);
        books[3] = new Book(1234567891126L, "Friday", "Andrew Man", 2017);
        books[4] = new Book(1234567891123L, "Wednesday", "Andrew Man", 2022);
    }

    private void printArray(Object[] arr, String reportTitle) {
        System.out.println("======"+ reportTitle + "=======");
        for (Object o : arr) {
            System.out.println(o);
        }
    }

    @Test
    void testPrint(){
        printArray(books, "List of our books that we placed in our setUp method");
    }
    @Test
    void testNativeSorting(){
        printArray(books, "List of our books that we placed in our setUp method");
        Arrays.sort(books); // native sorting
        printArray(books, "List of books sorted by author");
    }

    @Test
    void testComparator() {
        //Comparator<Book> comparator = (b1, b2) -> (int)(b1.getYearOfPublishing() - b2.getYearOfPublishing());
        Comparator<Book> comparator1 = (b1, b2) -> Integer.compare(b1.getYearOfPublishing(), b2.getYearOfPublishing());
        // lambda expression
        printArray(books, "Before sorting");
        Arrays.sort(books); // native sorting
        printArray(books, "After sorting by Author");
        Arrays.sort(books, comparator1);
        printArray(books, "After sorting by year of publishing");
    }
}

