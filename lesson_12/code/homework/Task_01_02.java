package homework;



public class Task_01_02 {
    public static void main(String[] args) {
        // Task 1
        String[] inputWords = {"Java", "is", "a", "powerful", "language"};
        ArrMethods.printArray(inputWords);
        String[] res = ArrMethods.shortestLongest(inputWords);
        System.out.println("Shortest string is: " + res[0]);
        System.out.println("Longest string is: " + res[1]);
        // Task 2

        int[] firstArray = {0, 1, 2, 3, 4, 5, 6};
        ArrMethods.printArray(firstArray);
        int newLength = 3;
        int [] copiedArray = ArrMethods.copyOfArray(firstArray, newLength);
        ArrMethods.printcopyArray(copiedArray);
    }
}
