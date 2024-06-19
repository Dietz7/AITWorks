package homework_15.book.model;

public class Book {
    private long isbn;
    private String title;
    private String author;
    private int yearOfPublishing;

    // Constructor that initializes all fields

    public Book(long isbn, String title, String author, int yearOfPublishing) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    // Constructor for initialising fields without field named author
    public Book(long isbn, String title, int yearOfPublishing) {
        this.isbn = isbn;
        this.title = title;
        this.author = "Unknown";
        this.yearOfPublishing = yearOfPublishing;

    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    private long checkIsbn(long isbn) {
        if (isbn >= 1_000_000_000_000L && isbn <= 9_999_999_999_999l) {
            return isbn;
        }
        return -1;
    }


    public void displayBook (){
     System.out.println("ISBN: " + isbn + ", Title: " + title + ", Author: " + author + " , Year of publishing: " + yearOfPublishing);

 }


}
