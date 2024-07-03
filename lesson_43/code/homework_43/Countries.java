package homework_43;

import java.util.HashMap;
import java.util.Map;

public class Countries {
    public static void main(String[] args) {

        // Create a map to store countries and their continents
        Map<String, String> countryContinentMap = new HashMap<>();

        // Add countries to the map
        countryContinentMap.put("Canada", "North America");
        countryContinentMap.put("United States", "North America");
        countryContinentMap.put("Mexico", "North America");
        countryContinentMap.put("Cuba", "North America");

        countryContinentMap.put("Brazil", "South America");
        countryContinentMap.put("Argentina", "South America");
        countryContinentMap.put("Colombia", "South America");
        countryContinentMap.put("Peru", "South America");

        countryContinentMap.put("Germany", "Europe");
        countryContinentMap.put("France", "Europe");
        countryContinentMap.put("Spain", "Europe");
        countryContinentMap.put("Norway", "Europe");

        countryContinentMap.put("China", "Asia");
        countryContinentMap.put("Japan", "Asia");
        countryContinentMap.put("India", "Asia");
        countryContinentMap.put("South Korea", "Asia");

        countryContinentMap.put("Nigeria", "Africa");
        countryContinentMap.put("South Africa", "Africa");
        countryContinentMap.put("Kenya", "Africa");
        countryContinentMap.put("Egypt", "Africa");

        countryContinentMap.put("Australia", "Australia");
        countryContinentMap.put("New Zealand", "Australia");

        // Create a map to store the count of countries per continent
        Map<String, Integer> continentCountMap = new HashMap<>();

        // Count the number of countries per continent
        for (String country : countryContinentMap.keySet()) {
            String continent = countryContinentMap.get(country);
            continentCountMap.put(continent, continentCountMap.getOrDefault(continent, 0) + 1);
        }

        // Print the number of countries on each continent
        for (Map.Entry<String, Integer> entry : continentCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " countries");
        }
    }
    }

