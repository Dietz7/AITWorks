package classwork;
//Реализовать метод, который принимает на вход сумму денег в евро, а возвращает ее значение
//в долларах. Значение курса задать внутри программы.


public class CurrencyConverter {
    public static void main(String[] args) {

      double money = 358.5;
      double rate = 1.07;

      double resInDollars = convertToDollars(money, rate);
        System.out.println("Result = " + resInDollars);
        System.out.printf("Result = %.2f", resInDollars); // cherez zapyatuji poskolku eto funktion

    }

    private static double convertToDollars(double money, double rate) {
        return money * rate;
    }

}
