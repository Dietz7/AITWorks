package classwork_20.library;

import classwork_20.library.controller.Library;
import classwork_20.library.model.Book;

public class LibraryAppl {
    public static void main(String[] args) {
        Library library = new Library (1000);
        library.addBook(new Book("Biology of Belief", "Bruce Lipton", 2020, 1000000000000L));
        library.addBook(new Book("Title 1", "Author1", 2021, 2000000000000L));
        library.addBook(new Book("Title 2", "Author2", 2023, 3000000000000L));

        System.out.println(library.getSize());


        library.addBook(new Book ("Title 3", "Author3", 2020, 3000000000000L));
        System.out.println(library.getSize());

        library.printBooks();

        library.addBook(new Book("Title 4", "Author4", 2024, 4000000000000L));
        library.printBooks();

        library.removeBook(4000000000000L); // remove
        System.out.println(library.getSize());
        library.printBooks();


    }
}
