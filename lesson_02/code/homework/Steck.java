package homework;

public class Steck {
    public static void main(String[] args) {
        System.out.println("main method has started");
        method1();
        System.out.println("main method has finished");
    }

    public static void method1() {
        System.out.println("method1 has started");
        method2();
        System.out.println("method1 has finished");
    }
    public static void method2() {
        System.out.println("method2 has started");
        method3();
        System.out.println("method2 has finished");
    }

    public static void method3() {
        System.out.println("method3 has started");
                System.out.println("method3 has finished");
    }
}
