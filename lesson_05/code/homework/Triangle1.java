package homework;
/* Define the three sides of the triangle in the program. Check the validity of the triangle
inequality - any of the sides must be smaller the sum of the other two. Report the result -
whether a triangle with the given sides exists or not.*/

public class Triangle1 {
    public static void main(String[] args) {

        double a = 15;
        double b = 25;
        double c = 37;


        if ( (a + b) > c && (a + c) > b && (b + c) > a){
            System.out.println("Triangle with the given sides exists");
        } else {
            System.out.println(" Triangle with the given sides does not exist");

        }
    }


}
