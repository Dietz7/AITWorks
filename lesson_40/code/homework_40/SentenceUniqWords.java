package homework_40;

import java.util.HashSet;
import java.util.Set;

public class SentenceUniqWords {
    public static void main(String[] args) {
        String sentence = "Он был человек, безусловно, больной, потому что в мире, видимо, есть две категории людей, - одни, способные видеть божество, и другие, не способные видеть божество, - и первая категория, хотя и содержит в себе много людей с мятежным духом, всё-таки живёт в богословском веке, тогда как вторая категория, к которой принадлежал Иван Фёдорович, неизбежно и вполне сознательно вступает в тьму, ибо человек, который хотя бы только один раз, даже всего на одну минуту, видит Бога, уже не может отказаться от этого видения и опять стать обыкновенным человеком.";

        String[] words = sentence.split(" ");
        int l = words.length;
        System.out.println("Words in sentence: " + l);
        Set<String> uniqueWords = new HashSet<>();
        for (String s : words) {
            uniqueWords.add(s);
        }
        System.out.println(uniqueWords + "\n");
        System.out.println("The number of unique words in sentence is: " + uniqueWords.size());

        // counting unique characters
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : sentence.toCharArray()) {
            if (c != ' ' && c != ',' && c != '-') { // Ignore spaces and common punctuation
                uniqueChars.add(c);
            }
        }
        System.out.println("Unique characters: " + uniqueChars);
        System.out.println("The number of unique characters in sentence is: " + uniqueChars.size());
    }

}
