package homework;

public class Optional {
    public static void main(String[] args) {
        double c = 100; // side c - base of triangle;
        double p = 70; //  height p - perpendicular to the side c;
        double area = areaofTriangle (c,p);
        System.out.println("Area of triangle = " + area);

        double a = 80; // cathetus 1;
        double b = 65; // cathetus 2;
        double l = lengthofHypotenuse (a,b);
        System.out.println("Length of hypotenuse = " + l);

        double a1 = 84; //value of the angle1, that we know;
        double a2 = 44; //value of the angle2, that we know;
        double a3 = valueofAngle (a1, a2);
        System.out.println("Value of the third angle a3 = "  + a3);

    }
//Method for calculating the value of the 3rd angle of a triangle:2 angles are known
    private static double valueofAngle(double a1, double a2) {
        double a3 = 180 - a1 - a2;
        return a3;
    }
//Method for calculating of the hypotenuse: 2 cathetus are known; Pythagoras
    private static double lengthofHypotenuse(double a, double b) {
        double l = Math.sqrt(Math.pow (a, 2) + Math.pow (b, 2));
        return l;

    }
//Method for calculating the area of a triangle:base and height are known.
    private static double areaofTriangle(double c, double p) {
        double area = c * p / 2;
        return area;
    }


}
