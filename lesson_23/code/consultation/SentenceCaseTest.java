package consultation;

import classwork_23.sentence_test.Sentence;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class SentenceCaseTest {
    private Sentence sentence;

    @BeforeEach
    public void setUp () {
        this.sentence = new Sentence();



    }
    @Test
    public void testCountWords (){

        Sentence sentence1 = new Sentence();
        int countAnimalsInSentence = sentence1.countWords("cat dog cat dog");

        Assertions.assertEquals(4, countAnimalsInSentence);

    }
    @Test
    public void testCountSymbols (){
        Sentence sentence = new Sentence();
        int countAnimalsSymbols = sentence.countSymbols("cat dog qwq dkdks");
        Assertions.assertEquals(17, countAnimalsSymbols);


    }
}
