package classwork;

//1. Создайте метод, который возвращает целое число, противоположное по знаку.
 //       Пример: число -46, метод возвращает 46.
//
 //       2. Создайте метод, который возвращает куб числа.
  //      Пример: число 20, метод возвращает 8 000.
//
   //     3. Создайте метод, который принимает целое число и возвращает остаток от деления его на 2.
//Пример: число 41, метод возвращает 1.

public class Methods1 {


    public static void main(String[] args) {

        int x = 56;
        x = absolute(x);
        System.out.println(" x = " + x);

        double a = 10.d; // zadaem dejstvitelnoje chislo
        System.out.println("Cub = " + cubofNumber(a));

        int z = 57;
        System.out.println( z + " rest of division by 2 = " +restDivisionBy2(z));
    } // end of main

    public static int restDivisionBy2(int  z) { // eta z budet vidna tolko v etom methode
     return z % 2;
    }

    public static double cubofNumber(double z){
      return z * z * z;
    }

    public static int absolute(int number) { // eto signatura methoda 1-ja strochka kazdogo method
        return - number;
    }


} // end of class
