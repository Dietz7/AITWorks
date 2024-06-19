package homework_15.ait.book;

import homework_15.book.model.Book;


public class BookAppl {
    public static void main(String[] args) {
        Book book1 = new Book(9783453319837L, "Fahrenheit 451", "Ray Bradbury", 2018);
        Book book2 = new Book(9781401952471L, "The Biology of Belief", "Bruce H. Lipton", 2015);
        Book book3 = new Book(9783795724405L, "Pop Piano Playlist", "Carsten Gerlitz", 2022);
        Book book4 = new Book(9785818314853L, "Osnovu Miroponimanija", "Aleksandr Klyzovskij", 2008);


        System.out.println("Information about book 1:");
        book1.displayBook();
        System.out.println("Information about book 2:");
        book2.displayBook();
        System.out.println("Information about book 3:");
        book3.displayBook();
        System.out.println("Information about book 4:");
        book4.displayBook();
    }
}
