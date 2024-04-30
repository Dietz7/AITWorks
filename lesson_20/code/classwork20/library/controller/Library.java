package classwork20.library.controller;

import classwork20.library.model.Book;

public class Library {

    // fields
    // ARRAY FOR BOOKS
    private Book[] books;
    // number of books in library
    private int size;

    //constructor
    public Library(int capacity) {
        books = new Book [capacity];
        this.size = 0;

    }

    // methods
    // addBook
    public boolean addBook (Book book){
        // neobhodimo v massiv dobavit element
        // predusmotret, chto ne dobavljaem null, ne dobavljaetsa dublikat, nelzya previsit vmestimost biblioteki

        if (book == null || size == books.length || findBook(book.getIsbn()) != null) {
            return false;

        }
        books [size] = book; // size - eto index kotoroj eche net v massive, size -1 - eto poslednja kototraja est
        size++;
        return true;
    }

    public Book findBook(long isbn) {
        for (int i = 0; i < size; i++) {
          if (books[i].getIsbn() == isbn) {
              return books[i];
          }
        }
        return null;
    }

    // print books
    public void printBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
        System.out.println("=======================================");
    }
    // poluchenije kolichetva knig v biblioteke

    public int getSize () {
        return size;
    }

    public Book  removeBook (long isbn) {
     // najdem  udalyaemuj knigu

        Book victim = null;
        // ischem knigu po isbn 
        for (int i = 0; i < size; i++) {
            if (books [i].getIsbn() == isbn) {
                victim = books [i];
                books [i] = books [size - 1]; // na mesto i - oj knigi postavili poslednyju
                 books [size - 1] = null;
                 size--;
                 break;
            }
        }

        // na ee mesto postavim poslednjuu knigu iz imejuchixcya v massive

        // size --

        // return udalyaemuju knigu
        return victim;
    }


}
