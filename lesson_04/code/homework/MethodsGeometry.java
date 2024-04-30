package homework;
/*
1. Write an application that calculates the volume of a cube based on the length of its edge and
its surface area.
2. Write an application that calculates the area of a parallelogram given its base and height.
*/

public class MethodsGeometry {
    public static void main(String[] args) {

        double a = 10.0d;
        System.out.println("Volume of cube = " + VolumeOfCube(a));
        System.out.println("Area of surface cube = " + AreaOfSurface(a));

        double c = 10.0d, h = 110.0d;
        System.out.println("Area of Parallelogram = " + AreaofParallelogram(c,h));

    } // end of main

    public static double AreaofParallelogram (double z, double y){
        return z * y;
    }

    public static double AreaOfSurface (double z){
    return 6 * Math.pow(z,2);
}

    public static double VolumeOfCube (double z) {
        return Math.pow(z, 3);
    }

} // end of class
