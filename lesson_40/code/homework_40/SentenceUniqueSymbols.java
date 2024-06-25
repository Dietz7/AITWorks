package homework_40;

import java.util.HashSet;
import java.util.Set;

public class SentenceUniqueSymbols {
    public static void main(String[] args) {
        String sentence = "Он был человек, безусловно, больной, потому что в мире, видимо, есть две категории людей, - одни, способные видеть божество, и другие, не способные видеть божество, - и первая категория, хотя и содержит в себе много людей с мятежным духом, всё-таки живёт в богословском веке, тогда как вторая категория, к которой принадлежал Иван Фёдорович, неизбежно и вполне сознательно вступает в тьму, ибо человек, который хотя бы только один раз, даже всего на одну минуту, видит Бога, уже не может отказаться от этого видения и опять стать обыкновенным человеком.";
        int uniqueWordsCount = countUniqueWords(sentence);
        int uniqueCharsCount = countUniqueCharacters(sentence);

        System.out.println("The number of unique words: " + uniqueWordsCount);
        System.out.println("The number of unique characters: " + uniqueCharsCount);
    }

    // A method for counting unique words in a sentence
    public static int countUniqueWords(String sentence) {
        Set<String> uniqueWords = new HashSet<>();
        String[] words = sentence.split("[^\\p{L}]+"); // Разбиваем предложение на слова

        for (String word : words) {
            if (!word.isEmpty()) {
                uniqueWords.add(word.toLowerCase()); // Добавляем слово в нижнем регистре (учитываем регистронезависимость)
            }
        }

        return uniqueWords.size();
    }

    // Метод для подсчета уникальных символов в предложении
    public static int countUniqueCharacters(String sentence) {
        Set<Character> uniqueChars = new HashSet<>();

        for (int i = 0; i < sentence.length(); i++) {
            char ch = Character.toLowerCase(sentence.charAt(i)); // Рассматриваем символы в нижнем регистре
            if (Character.isLetter(ch)) { // Учитываем только буквенные символы
                uniqueChars.add(ch);
            }
        }

        return uniqueChars.size();
    }

}

/*Метод countUniqueWords:

Разбивает предложение на слова с помощью регулярного выражения [^\\p{L}]+, которое означает разделение по всем символам, не являющимися буквами.
Использует множество HashSet для хранения уникальных слов в нижнем регистре (для учета регистронезависимости).
Возвращает размер множества, который отражает количество уникальных слов в предложении.
Метод countUniqueCharacters:

Проходит по каждому символу в предложении.
Использует множество HashSet для хранения уникальных буквенных символов в нижнем регистре.
Возвращает размер множества, который отражает количество уникальных буквенных символов в предложении.
Замечания:
Оба метода учитывают регистронезависимость путем преобразования всех слов и символов в нижний регистр.
Регулярное выражение [^\\p{L}]+ используется для разделения предложения на слова, учитывая только буквенные символы.
Результаты подсчета выводятся на консоль: количество уникальных слов и количество уникальных символов.*/
