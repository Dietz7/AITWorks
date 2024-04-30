package homework;

public class Factorial {
    public static void main(String[] args) {
        int n = 32;
        int f = factorial(n);
        System.out.println("Factorial " + n + " is " + f);

    } // end of main

    public static int factorial(int n){
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f*=i;
        }
        return f;
    }

} // end of class

