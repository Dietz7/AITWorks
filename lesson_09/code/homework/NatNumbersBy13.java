package homework;
//Task 2. Print out all natural numbers less than 200 and multiples of 13.

public class NatNumbersBy13 {
    public static void main(String[] args) {

        int number = 13;
        while (number < 200) {
            System.out.print(number + " | ");
            number +=13;
        }
    }
}