package consultation;

public class Calculation {
    public static void main(String[] args) {
        int targetNumber = 9 * 1915;
        int result = sumUpTo(targetNumber);
        System.out.println("sumUpTo(" + targetNumber + ") = " + result);

    }

    public static int sumUpTo(int targetNumber) {
        int result = 0;

        for (int i = 1; i<= targetNumber; i++) {
            result += i;
        }
        return result;
    }

}
