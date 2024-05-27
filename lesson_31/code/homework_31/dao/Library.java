package homework_31.dao;

import homework_31.model.Book;

public interface Library {
 boolean addBook(Book book);
 Book removeBook(long isbn);
 Book findBook(long isbn);
 int quantity();
 void printBook();
}
