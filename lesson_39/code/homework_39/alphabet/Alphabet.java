package homework_39.alphabet;

import java.util.ArrayList;

//Fill a structure of type ArrayList with Latin characters from A to Z
public class Alphabet {
    public static void main(String[] args) {
        ArrayList<Character> alphabet = new ArrayList<>();
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            alphabet.add(ch);
        }
        for (char ch : alphabet){
            System.out.print(ch + " | ");
        }
    }
}
