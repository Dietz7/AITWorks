package homework;

public class ArrMethods {
    //method returns an array consisting of the shortest and longest string of the original array.

    public static void printArray (String [] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray [i] + " ");
        }
        System.out.println();
    }

    public static String [] shortestLongest( String [] strings) {
        if (strings == null || strings.length == 0) {
            return new String [0]; // returns an empty array if the input is null or empty
        }

        String shortest = strings[0];
        String longest = strings[0];

        for (int i = 0; i < strings.length; i++) {
            // (condition ? trueValue : falseValue) to determine whether strings[i]
            // is shorter than the current shortest string.
            shortest = strings[i].length() < shortest.length() ? strings[i] : shortest;
            longest = strings[i].length() > longest.length() ? strings[i] : longest;
        }
        return new String[] { shortest, longest };

    }

    public static void printArray (int [] myArray) {
        System.out.print("{");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray [i]);
            if(i < myArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("}");
        System.out.println();
    }


    public static int [] copyOfArray (int [] myArray, int newLength) {
      if (myArray == null || myArray.length == 0 || newLength <= 0) {
        return new int [0];
      }
      int [] myNewArray = new int [newLength];
        for (int i = 0; i < newLength && i < myArray.length; i++) {
            myNewArray [i] = myArray [i];
        }
        return myNewArray;
    }

    public static void printcopyArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

}
