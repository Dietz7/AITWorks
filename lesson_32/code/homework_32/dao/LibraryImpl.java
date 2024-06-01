package homework_32.dao;

import homework_32.model.Book;

public class LibraryImpl implements Library {
    // now we are adding our fields
    private Book[] books;
    ;
    int size;
    private String author;
    // our constructor

    public LibraryImpl(int capacity) {
        books = new Book[capacity];
        size = 0;

    }

    @Override
    public boolean addBook(Book book) {
        if (book == null || size == books.length) {
            return false;
        }
        if (findBook(book.getIsbn()) != null) {
            return false;
        }

        books[size++] = book;
        return true;
    }


    @Override
    public Book removeBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn) {
                Book removedBook = books[i];
                books[i] = books[size - 1];
                books[size - 1] = null;
                size--;
                return removedBook;
            }

        }
        return null;
    }

    @Override
    public Book findBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn) {
                return books[i];
            }
        }
        return null;
    }

    @Override
    public Book findBookByAuthor(String author) {
        for (int i = 0; i < size; i++) {
            if(books[i].getAuthor().equals(author)){
                return books[i];
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printBook() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);

        }

    }


}
