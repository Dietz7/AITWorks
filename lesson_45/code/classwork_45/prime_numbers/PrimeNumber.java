package classwork_45.prime_numbers;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public static void main(String[] args) {
        // 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20
        // filter only prime numbers

        List<Integer> numbers = new ArrayList<>(List.of(
                10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20
        ));

        //1st approach
        numbers.stream()
                .forEach(n -> System.out.print(n + " | ")); // terminal operations
        System.out.println();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Prime numbers");
        numbers.stream()
                .filter(n -> isPrime(n))
                .forEach(n -> System.out.print(n + " | "));
        System.out.println("----------------------------------------------------------------");
        // 2n approach
        numbers.stream()
                .map(n -> isPrime(n))
                .forEach(n -> System.out.print(n + " | "));
        System.out.println();
        System.out.println("-----------------------------------------------------------------");

    }


    public static boolean isPrime(int n) {
        int i = 2;
        while (i < n) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
