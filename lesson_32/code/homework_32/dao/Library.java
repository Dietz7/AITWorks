package homework_32.dao;

import homework_32.model.Book;

public interface Library {
 boolean addBook(Book book);
 Book removeBook(long isbn);
 Book findBook(long isbn);
 Book findBookByAuthor(String author);
 int quantity();
 void printBook();
}
