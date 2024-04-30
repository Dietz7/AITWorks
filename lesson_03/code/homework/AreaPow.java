package homework;

public class AreaPow {
    public static void main(String[] args) {

        double r = 200;
        double res = areaofCircle (r);
        double a = 500;
        double res1 = areaofSquare (a);
        double b = 1000;
        double c = 2000;
        double j = 2;
        double per = perimeterofRectangle (b,c, j);
        double res2 = areaofRectangle(b,j, per);

        System.out.println("Area of circle = " + res);
        System.out.println("Area of square = " + res1);
        System.out.println("Perimeter of rectangle = " + per);
        System.out.println("Area of rectangle = " + res2);
    }

    private static double areaofRectangle(double b, double j, double per) {
        return (per * b - j * Math.pow (b, 2)) / j;
        //double res = (per * b - j * b * b) / j;
    }
    private static double perimeterofRectangle(double b, double c, double j) {
        double per = j * (b + c);
        return per;
    }
    private static double areaofSquare(double a) {
        return Math.pow(a, 2);

    }
    private static double areaofCircle(double r) {
        return Math.PI * Math.pow(r, 2);
    }
}
