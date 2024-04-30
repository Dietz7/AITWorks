package classwork;
/*Создайте массив, который содержит возраст студентов группы.
        - какой возраст максимальный?
        - какой возраст минимальный?*/

public class AgeOfCohort {
    public static void main(String[] args) {

        int [] ageOfStudent = {31, 44, 28, 39, 21, 26, 44, 45, 38, 60};
        // max element in the array

        int max = ageOfStudent [0];
        int indexMax = 0;

        for (int i = 0; i < ageOfStudent.length; i++) {
           if (ageOfStudent[i] > max) {
               max = ageOfStudent [i];
               indexMax = i;
           }
        }

        System.out.println("Max age = " + max);
        System.out.println("Index of max element: " + indexMax);

    }
}
