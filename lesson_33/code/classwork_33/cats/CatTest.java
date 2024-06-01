package classwork_33.cats;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    Cat [] cat;

    @BeforeEach
    void setUp() {

        cat = new Cat[4];
        cat[0] =  new Cat(101, "Tishka", "brit", 5, 3.5);
        cat[1] =  new Cat(102, "Genny", "sfinks", 1, 1.2);
        cat[2] =  new Cat(103, "Murzik", "pers", 9, 5.0);
        cat[3] =  new Cat(104, "Motya", "maikun", 2, 8.5);

    }

    @Test
    void testCatSort() {
        System.out.println("================Test Cat Sorting=================");
        printArray(cat);
        Arrays.sort(cat); // we are doing the process sorting
        System.out.println("--------After sorting by age--------");
        printArray(cat);
    }


    @Test
    void testCatComparator(){
        Comparator<Cat> catComparator = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getName().compareTo(o2.getName()); // we are sorting by name (alhphabetically)
            }
        };

        System.out.println("================Test Cat Sorting=================");
        printArray(cat); // print as it is
        System.out.println("================Test Cat Sorting=================");
        Arrays.sort(cat, catComparator); // we are sorting again
        printArray(cat); // print after sorting
    }

    @Test
    void testCatComparator2(){
        Comparator<Cat> catComparator = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return (int) (o1.getWeight() - o2.getWeight()); // we are sorting by weight
            }
        };

        System.out.println("================Test Cat Sorting=================");
        printArray(cat); // print as it is
        System.out.println("================Test Cat Sorting=================");
        Arrays.sort(cat, catComparator); // we are sorting again
        printArray(cat); // print after sorting
    }






    public void printArray(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}