package classwork_45.primitive_stream;

import java.util.IntSummaryStatistics;
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

        System.out.println("-------------------Sum of Numbers---------------------------");

        int sum = getRandomNumbers(N_NUMBERS, MIN, MAX)     // flow of objects
                .mapToInt(Integer::intValue)
                //.peek(System.out::println); // current print
                .sum();

        System.out.println("Sum = " + sum);

        System.out.println("----------------------Summary Statistics-----------------------------");
        IntSummaryStatistics intStat = getRandomNumbers(N_NUMBERS, MIN, MAX)
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        System.out.println("Min = " + intStat.getMin());
        System.out.println("Max = " + intStat.getMax());
        System.out.println("Average value = " + intStat.getAverage());
        System.out.println("Sum = " + intStat.getSum());


        System.out.println("------------------- Lotto 6 from 49 --------------------------");
        new Random()
                .ints(1, 50)
                .distinct()
                .limit(6)
                .forEach(System.out::println);

        System.out.println("----------------------------Shuffle------------------------------------");

        int [] arr = {10, 20, 30, 40, 50};

        new Random()
                .ints(0, arr.length)
                .distinct()
                .limit(arr.length)
                .forEach(i -> System.out.println(arr[i]));// thanks to i iterrating trhough our array

    } // end of main

    private static Stream<Integer> getRandomNumbers(int nNumbers, int min, int max) {
        return new Random()
                .ints(min, max)
                .limit(nNumbers)
                .mapToObj(n->(Integer)n);
                //.boxed(); //terminal operation
    }
}
