package homework_15.cube;

 public class Cube {
     int a;

     // CREATE CONSTRUCTOR

     public Cube(int a) {
         this.a = a;
     }

     public int getA() {
         return a;
     }

     public void setA(int a) {
         this.a = a;
     }

     // METHODS
     public int calculatePerimeter() {
         return 12 * a;
     }

     public int calculateSurfaceArea() {
         return 6 * a;
     }

     public int calculateVolume() {
         return a * a * a;
     }

    }

