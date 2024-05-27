package classwork_30.calculator;

public class LambdaApp {
    public static void main(String[] args) {

        Calculator plus = (a, b) -> a + b;


        Calculator minus = ( a,b) -> a - b;


        int resultSum = plus.operate(5, 6);
        System.out.println(resultSum);

        int resultDiff = minus.operate(2, 9);
        System.out.println("diff: " + resultDiff);
    }
}
