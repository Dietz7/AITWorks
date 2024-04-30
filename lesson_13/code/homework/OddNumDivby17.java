package homework;
// Find the product of all two-digit odd numbers that are multiples of 17.

public class OddNumDivby17 {
    public static void main(String[] args) {
        int product = 1;

        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0 && i % 17 == 0) {
                product *= i;
            }
        }
        System.out.println("Product of all two-digit odd numbers that are multiples of 17: " + product);
    }

    }

