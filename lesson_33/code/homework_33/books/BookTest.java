package homework_33.books;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book [] book;

    @BeforeEach
    void setUp() {
        book = new Book[4];
        book [0] = new Book(1234567891123L, "Sunday", "John Smith", 2024);
        book [1] = new Book(1234567891124L, "Monday", "Hans Clever", 2019);
        book [2] = new Book(1234567891125L, "Saturday", "Ann Red", 2018);
        book [3] = new Book(1234567891126L, "Friday", "Andrew Man", 2022);

    }
    @Test
    void TestBookSort() {
        System.out.println("==================Test Book Sorting=====================");
        printArray(book);
        Arrays.sort(book); // we are realizing the process of sorting
        System.out.println("--------------After sorting by Author------------------");
        printArray(book);
    }

    @Test
    void TestBookComparator() {
        Comparator<Book> bookComparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getYearOfPublishing() - o2.getYearOfPublishing(); // we are sorting now by year of publishing
            }
        };

        System.out.println("================Test Book Sorting=================");
        printArray(book); // print as it is
        System.out.println("-----------------After sorting by Year of Publishing--------------------");
        Arrays.sort(book, bookComparator); // we are sorting again
        printArray(book); // print after sorting
    }



    public void printArray(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}