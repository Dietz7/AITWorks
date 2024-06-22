package homework_39.alphabet;

import java.util.ArrayList;

public class AlbhabetList {
    public static void main(String[] args) {
        ArrayList<Character> alphabet = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
           alphabet.add((char)(i + 65));
        }

        for (char ch : alphabet){
            System.out.print(ch + " | ");
        }
    }
}
