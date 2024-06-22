package homework_39.random_numbers;

import java.util.ArrayList;

public class RandomNums {
    public static void main(String[] args) {
        ArrayList<Integer> randomNums = new ArrayList<>();
        int b = 10;
        int a = 1;
        int c = 0;

        for (int i = 0; i < 20; i++) {
            c = (int)(Math.random()* (b - a + 1) + a);
            randomNums.add(c);
        }
        System.out.println("Original List: ");
        System.out.println("====================================================================================");
        //Print the list before removing duplicates
        for (Integer nums : randomNums) {
            System.out.print(nums + " | ");
        }
        System.out.println("\n====================================================================================");
        //now we are removing duplicates
        ArrayList<Integer> uniqueNums = removeDuplicates(randomNums);
        // Print the list after removing duplicates
        System.out.println("List after removing duplicates: " + uniqueNums);
    }

    private static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
      ArrayList<Integer> res = new ArrayList<>();
      for(Integer num : list){
          if(!res.contains(num)) {
              res.add(num);
          }
      }
      return res;
    }
}
