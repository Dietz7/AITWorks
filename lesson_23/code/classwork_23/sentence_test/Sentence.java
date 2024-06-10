package classwork_23.sentence_test;

public class Sentence {

    // count words
    public int countWords(String str) {
        int res = 0;
        String [] words = str.split(" ");
        return words.length;
    }
    // count symbols
    public int countSymbols(String str) {
        String [] letters = str.split("");
        return letters.length;
    }

}
