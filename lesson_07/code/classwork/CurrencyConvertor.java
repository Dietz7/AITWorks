package classwork;

/*Написать программу для конвертации евро в три валюты - доллар, фунт стерлингов и швейцарский франк.
Для каждой валюты реализуйте свой метод конвертации.
Не допускайте ввода некорректных (отрицательных) значений обмениваемой валюты.*/

import java.util.Scanner;

public class CurrencyConvertor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which  currency do you have? (USD, CHF, GBP)");
        String currency = scanner.nextLine();
        System.out.println("How much currency do you have? ");
        double summa = scanner.nextDouble();

        double result = 0; // vidimost etoj peremennnoj na vsyu programmu
        double rateUsd = 1.08;
        double rateChf = 0.95;
        double rateGbp = 1.17;



        switch (currency) {
            case "USD" -> result = exchange(summa, rateUsd);
            case "CFH" -> result = exchange(summa, rateChf);
            case "GBP" -> result = exchange(summa, rateGbp);
            default -> System.out.println("Wrong input");
        }

        System.out.println("Pls, take your money in euro " + result);
    }

    private static double exchange(double summa, double rate) {
        return summa / rate;
    }
}

/***Шаг 1.**
Что дано?
 Выписать все, что дано в задаче, продумать типы и имена необходимых переменных.
 double euro, frank, dollar, pound, rate
 euro - dollar : 1.08
 euro - pound : 1.17
 euro - frank : 0.95
how to exchange - we have euro, we get  currency

 **Шаг 2**
Что нужно сделать?
 Выписать все, что нужно найти или сделать в рамках задачи.
Продумать типы и имена необходимых переменных, продумать возможные необходимые методы.
 method -convertor: on poluchajet na vhod double x - kolichestvo valjut , method dolzhen raschitat
 kolichestvo euro, kotoroje mozhem prodat
 kolichestvo euro = kolichestvo valjutu * rate
convertor, switch case v programme calculator

**Шаг 3.**
Как это уже решали?
Найти фрагменты похожего кода, решения похожих задач от которых можно оттолкнуться и решить "по аналогии" свою задачу.

 **Шаг 4.**
Какой самый важный, сложный момент в задаче?
Продумать, написать по шагам ключевой алгоритм, который позволяет решить поставленную задачу.
 sdelat raschet skolko deneg otdat

**Шаг 5.**
Как будет работать программа?
Продумать интерфейс взаимодействия с пользователем.
 console, zapros-otvet */
