package classwork_43.map_introduction;

import java.sql.SQLOutput;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapIntroAppl {
    public static void main(String[] args) {
        // create Map containing the names of the city and his population

        // key - this is a city, String
        // value - population, Integer

        Map<String, Integer> usaCities = new TreeMap<>(); // create object, type of Object - TreeMap
        usaCities.put("Denver", 600000);
        usaCities.put("Boston", 670000);
        usaCities.put("Chicago", 2_700_000);
        usaCities.put("Atlanta", 470_000);
        usaCities.put("New York", 8_500_000);
        usaCities.put("Dallas", 1_300_000);
        usaCities.replace("Dallas", 1_300_010); // update

        // map size
        System.out.println(usaCities.size()); // 6
        System.out.println(usaCities.isEmpty());// false

        int population = usaCities.get("Chicago");
        System.out.println("Population of Chicago is: " + population);
        int population1 = usaCities.get("Dallas");
        System.out.println("Population of Dallas is: "+ population1);

        // check key
        System.out.println(usaCities.containsKey("Boston")); //true
        System.out.println(usaCities.containsKey("Los Angeles"));

        // 1st approach
        Collection<Integer> totalPopulation = usaCities.values();// create new object of type Integer
        int total = 0;
        for (Integer i: totalPopulation) {
            //total = total + i;
            total += i;
        }
        System.out.println("Total population in cities: " + total);

        // 2nd approach
        Set<String> setOfCities = usaCities.keySet();
        total = 0;
        for (String str : setOfCities) {
            total += usaCities.get(str);
        }
        System.out.println("Total population in cities: " + total);

        // print map
        System.out.println("================Print Map====================");
        Set<String> keys = usaCities.keySet();
        for (String str : keys) {
            System.out.println(str + " name of city");
        }

        // print map using Entry
        Set<Map.Entry<String, Integer>> entries = usaCities.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
       // print map another time
        System.out.println(usaCities.entrySet());
    }
}
