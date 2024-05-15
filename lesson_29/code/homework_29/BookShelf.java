package homework_29;

import java.util.ArrayList;
import java.util.List;


class BookShelf {
    private List<Book> books = new ArrayList<>();
private Iterator iterator = new Iterator();
    static class Book {
        String title;
        String author;
        int year;

        Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        @Override
        public String toString() {
            return title + " by " + author + ", " + year;
        }
    }

    void addBook(String title, String author, int year) {
        this.books.add(new Book(title, author, year));
    }
    void removeBook(String title) {
        List<Book> booksToRemove = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
           Book book = books.get(i);
           if(book.title.equals(title)) {
               booksToRemove.add(book);
           }
        }
        books.removeAll(booksToRemove);
        iterator.cursor = 0;
    }


    class Iterator {
        private int cursor = 0;

        public Book nextBook() {
            Book book = books.get(cursor);
            cursor += 1;
            if (cursor >= books.size()) {
                cursor = 0;
            }
            return book;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Book book : books) {
            result.append(book).append("\n");
        }
        return result.toString();
    }
}


class Main2 {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook("Fahrenheit 451", "Ray Bradbury", 2018);
        bookShelf.addBook("The Biology of Belief", "Bruce H. Lipton", 2015);
        bookShelf.addBook("Pop Piano Playlist", "Carsten Gerlitz", 2022);
        bookShelf.addBook("Osnovu Miroponimanija", "Aleksandr Klyzovskij", 2008);

        BookShelf.Iterator iterator = bookShelf.new Iterator();

        System.out.println(iterator.nextBook());
        System.out.println(iterator.nextBook());
        System.out.println(iterator.nextBook());
        System.out.println(iterator.nextBook());

        System.out.println("-----------------");

        System.out.println(bookShelf); // one more way to print the list of books
        System.out.println("-----------------");
        bookShelf.removeBook("Fahrenheit 451");

        System.out.println(bookShelf);

    }
}


