package homework_31.tests;

import homework_31.dao.Library;
import homework_31.dao.LibraryImpl;
import homework_31.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryImplTest {
    Library library;
    Book [] book;

    @BeforeEach
    void setUp() {
        library = new LibraryImpl(5);
        book = new Book[4];
        book [0] = new Book(9783453319837L, "Fahrenheit 451", "Ray Bradbury", 2018);
        book [1] = new Book(9781401952471L, "The Biology of Belief", "Bruce H. Lipton", 2015);
        book [2] = new Book (9783795724405L, "Pop Piano Playlist", "Carsten Gerlitz", 2022);
        book [3] = new Book (9785818314853L, "Osnovu Miroponimanija", "Aleksandr Klyzovskij", 2008);

        for (Book b : book) {
            library.addBook(b);

        }
    }

    // adding initial books to the library


    @Test
    void addBook() {
        // no null adding
        assertFalse(library.addBook(null));
        // we cannot add an identical book second time
        assertFalse(library.addBook(book[1]));
        Book book1 = new Book(9781107699892L, "Martin Hewings", "Advanced Grammmar in Use", 2005);
        // we have created and added a new book
        assertTrue(library.addBook(book1));
        assertEquals(5, library.quantity()); // there are 5 books now in our library
        Book book2 = new Book (4196828509903L, "Zeit Sprachen", "Deutsch Perfekt", 2023);
        // we have created one more book and exceeded our capacity, that is why we will be setting up a test, that shows it
        assertFalse(library.addBook(book2));

    }

    @Test
    void removeBook() {
        // now we are removing one book
        assertEquals(book [0], library.removeBook(9783453319837L));
        assertEquals(3, library.quantity());
        // check if we can remove the book twice
        assertNull(library.removeBook(9783453319837L));
        // test for checking if the removed book can be found
        assertNull(library.removeBook(9783453319837L));
    }

    @Test
    void findBook() {
        assertEquals(book [2], library.findBook(9783795724405L)); // search of the book by isbn
        assertNull(library.findBook(1234567891123L)); // search of the nonexisted book

    }

    @Test
    void quantity() {
        assertEquals(4, library.quantity()); // initially 4 books
        library.removeBook(9783453319837L);
        assertEquals(3, library.quantity()); // after removing one book
    }

    @Test
    void printBook() {
        library.printBook();
    }
}