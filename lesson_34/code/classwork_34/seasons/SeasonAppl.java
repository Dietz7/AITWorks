package classwork_34.seasons;

import homework.Seasons;

public class SeasonAppl {
    public static void main(String[] args) {

        // to try methods :
// .values()
// .toString
// .ordinal()
// .valueOf()

        Season[] seasons = Season.values(); // fill array
        for (int i = 0; i < seasons.length; i++) {
            // System.out.println(seasons[i]);
            //System.out.println(seasons[i].getName());
            System.out.println(seasons[i].getNumber() + "." + seasons[i].getName());
        }
        System.out.println("---------------------------------------");
            //foreach
         for (Season s : seasons) {
             System.out.println(s.getNumber()+ ". " + s.getName());
         }

        System.out.println("---------------toString-------------------");
         String str = Season.AUTUMN.toString();
        System.out.println(str);

        System.out.println("--------------ordinal()-------------------");
        int n = Season.AUTUMN.ordinal();
        System.out.println(n); // returns index of Autumn in array

        System.out.println("------------valueOf()---------------------");
        Season s = Season.valueOf("AUTUMN"); // constant AUTUMN
        System.out.println(s);
    }
}
