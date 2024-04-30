package homework.book;

import homework.book.model.Book;
import homework.book.model.Dictionary;

public class BookAppl {
    public static void main(String[] args) {
    Book book = new Book(9783453319837L, "Fahrenheit 451", "Ray Bradbury", 2018);
    book.displayBook();
    System.out.println("----------------------------------------------");
    Dictionary dictionaryEng = new Dictionary(2000L, "English Dictionary", "Bonk",
            1985, "english", 20000, "language");
    dictionaryEng.displayBook();
        System.out.println("------------------------------------------");
        Dictionary dictionaryWords = new Dictionary(3000L, "Words Dictionary", "Ojegov",
                1990, "russian", 30000, "words");
        dictionaryWords.displayBook();
        System.out.println("------------------------------------------");
    }
}
