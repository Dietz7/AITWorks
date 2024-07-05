package classwork_45.primitive_stream;

import java.util.Random;
import java.util.stream.Stream;


public class PrimitiveStreamExample {

    private static final int N_NUMBERS = 10; //define constant
    private static final int MIN = 1;
    private static final int MAX = 10;

    public static void main(String[] args) {
      //poluchit sluchajnuje chisla v vide potoka
        Stream<Integer> numbers = getRandomNumbers(N_NUMBERS, MIN, MAX);
        numbers.forEach(System.out::println);
    } // end of main

    private static Stream<Integer> getRandomNumbers(int nNumbers, int min, int max) {
        return new Random()
                .ints(min, max)
                .limit(nNumbers)
                .mapToObj(n->(Integer)n);
                //.boxed(); //terminal operation
    }
}
