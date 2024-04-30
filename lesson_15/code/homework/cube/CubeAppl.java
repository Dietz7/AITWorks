package homework.cube;

public class CubeAppl {
    public static void main(String[] args) {

    Cube cube1 = new Cube(10);
    Cube cube2 = new Cube(20);
    Cube cube3 = new Cube(30);

    System.out.println("Cube1: ");
    System.out.println("Perimeter: " + cube1.calculatePerimeter());
    System.out.println("Surface Area: " +cube1.calculateSurfaceArea());
    System.out.println("Volume: " + cube1.calculateVolume());
    System.out.println("==================================");

    System.out.println("Cube2: ");
    System.out.println("Perimeter: " + cube2.calculatePerimeter());
    System.out.println("Surface Area: " +cube2.calculateSurfaceArea());
    System.out.println("Volume: " + cube2.calculateVolume());
    System.out.println("==================================");

    System.out.println("Cube3: ");
    System.out.println("Perimeter: " + cube3.calculatePerimeter());
    System.out.println("Surface Area: " +cube3.calculateSurfaceArea());
    System.out.println("Volume: " + cube3.calculateVolume());
    }
}
