package classwork;
//Задание 3.** Написать метод, возвращающий максимальное из двух целых чисел.
//Реализовать метод, который возвращает максимальное из трех целых чисел. Числа задаются в программе.
//Написать метод, возвращающий максимальное из двух целых чисел, использовать тернарный оператор.

public class Maximum {
    public static void main(String[] args) {


        int a = 19250;
        int b = 18730;
        int c = 22137;

        int max = maximum(a, b);


        int max3 = maximum3(a, b, c);

        System.out.println(max3);

    } // end of main

    public static int maximum3(int a, int b, int c) {
        int max3 = 0;
        if (a > b & b < c) {
            max3 = c;
        }
        if (a < b & b > c) {
            max3 = b;
        }
        if (a > b & b > c) {
            max3 = a;
        }
        return max3;


    }

    public static int maximum (int a, int b){
        int max; // or int max = 0;

        if ( a <= b){
            System.out.println(b + " is maximum.");
            max = b;
        } else {
            System.out.println(a + " is maximum.");
            max = a;
        }
        return max;
    }



} // end of class
