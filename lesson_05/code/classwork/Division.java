package classwork;
// **Задание 4:**
// Реализовать метод, определяющий, делится ли одно целое число на другое нацело или нет.

public class Division {
    public static void main(String[] args) {

        int a = 111111;
        int b = 3;

        boolean result = division (a, b);
        System.out.println(a +  " % " + b + " = " + result);

    }

    public static boolean division(int a, int b){
        if (a % b == 0) {
            return true;
        } else {
            return false;
        }

    }
}
