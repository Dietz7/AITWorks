package homework;
//Task 1. What is the value of the expression x-- + --x at x = 5?
//Test your guess with code.
public class Expression {
    public static void main(String[] args) {
        int x = 5;
        int res1 = x--; // x raven poka 5 no v pamyati otlo
        int res2 = --x;
        int sum = res1 + res2;
        System.out.println(res1);
        System.out.println(res2);
        System.out.println("The value of the expression is: " + sum);
    }
}/*
изначально [x=5,y=x-- + 1]
read x [x=5,y=5 + 1]
decrement x [x=4,y=5 + 1]
sum 5 1 [x=4,y=6]
------------
изначально [x=5,y=--x + 1]
decrement x [x=4,y=x + 1]
read x [x=4,y=4 + 1]
sum 5 1 [x=4,y=5]
----------
изначально [x=5,y=x-- + --x]
read x [x=5,y=5 + --x]
decrement x [x=4,y=5 + --x]
decrement x [x=3,y=5 + --x]
read x [x=3,y=5 + 3]
sum 5 3 [x=4,y=8]

* */