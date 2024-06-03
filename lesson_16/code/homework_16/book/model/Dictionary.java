package homework.book.model;

public class Dictionary extends Book {

    private String language;
    private int numberOfWords;
    private String speciality;

    public Dictionary(long isbn, String title, String author, int yearOfPublishing, String language, int numberOfWords, String speciality) {
        super(isbn, title, author, yearOfPublishing);
        this.language = language;
        this.numberOfWords = numberOfWords;
        this.speciality = speciality;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getNumberOfWords() {
        return numberOfWords;
    }

    public void setNumberOfWords(int numberOfWords) {
        this.numberOfWords = numberOfWords;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "language='" + language + '\'' +
                ", numberOfWords=" + numberOfWords +
                ", speciality='" + speciality + '\'' +
                '}';
    }


    @Override
    public void displayBook() {
        super.displayBook();
        System.out.println("Dictionary{" +
                "language='" + language + '\'' +
                ", numberOfWords=" + numberOfWords +
                ", speciality='" + speciality + '\'' +
                '}');
    }
}
