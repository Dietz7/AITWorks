package homework;


public class Area {
    public static void main(String[] args) {
        double constanta = pi ();
        System.out.println(constanta);
        PrintPi (constanta);

        double r = 200;
        double res = areaofCircle (r);
        double a = 500;
        double res1 = areaofSquare (a);
        double b = 1000;
        double c = 2000;
        int j = 2;
        double per = perimeterofRectangle(b,c, j);
        double res2 = areaofRectangle (per, b, j);
        System.out.println("Area of circle = " + res);
        System.out.println("Area of square = " + res1);
        System.out.println("Perimeter of Rectangle = " + per);
        System.out.println("Area of Rectangle = " + res2);

    }
// Method for calculating the area of a rectangle
    private static double areaofRectangle(double per, double b, int j) {
        double res2 = (per * b - j * b * b) / j;
        return res2;
    }

    private static double perimeterofRectangle(double b, double c, int j) {
        double per = j *(b + c);
        return per;

    }


    //Method for calculating the area of a square; without "pow" method
    private static double areaofSquare(double a) {
        double area1 = a * a;
        return area1;
    }

    //Method for calculating the area of a circle; without "pow" method
    private static double areaofCircle(double r) {
        double area = pi() * r * r;
        return area;
    }

    private static void PrintPi(double pi) {
        System.out.println("Pi = " + pi);
    }
    private static double pi() {
        double pi = 3.1415926536;
        return pi;
    }

}
