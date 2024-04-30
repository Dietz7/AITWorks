package homework;
// It was put s euro into the savings bank for a three percent deposit.
// What will the deposit amount be after n years? Use a for loop.

public class Deposit {
    public static void main(String[] args) {
        double s = 10000;
        double rate = 0.03;
        int n = 7;

        double deposit = s;
        for (int i = 0; i <n ; i++) {
           deposit+=deposit*rate;
        }
        System.out.printf("The deposit amount after " + n  + " years will be %.2f" , deposit);
    }
}
