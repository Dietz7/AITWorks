package homework_39.planets;

import java.util.ArrayList;
import java.util.Collections;

/*

public class PlanetsAppl {
        public void main(String[] args) {
            ArrayList<PlanetsList.Planet> planets = new ArrayList<>();

            // Add planets to the list
            planets.add(new PlanetsList.Planet("Mercury", 0.39, 0.055, 0));
            planets.add(new PlanetsList.Planet("Venus", 0.72, 0.815, 0));
            planets.add(new PlanetsList.Planet("Earth", 1.0, 1.0, 1));
            planets.add(new PlanetsList.Planet("Mars", 1.52, 0.107, 2));
            planets.add(new PlanetsList.Planet("Jupiter", 5.2, 317.8, 79));
            planets.add(new PlanetsList.Planet("Saturn", 9.58, 95.2, 82));
            planets.add(new PlanetsList.Planet("Uranus", 19.22, 14.6, 27));
            planets.add(new PlanetsList.Planet("Neptune", 30.05, 17.2, 14));

            // Sort planets by distance to the Sun (default order)
            Collections.sort(planets);
            System.out.println("Planets sorted by order of location in the solar system:");
            printPlanets(planets);

            // Sort planets alphabetically by name
            planets.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
            System.out.println("\nPlanets sorted alphabetically by name:");
            printPlanets(planets);

            // Sort planets by mass
            planets.sort((p1, p2) -> Double.compare(p1.getMass(), p2.getMass()));
            System.out.println("\nPlanets sorted by mass:");
            printPlanets(planets);

            // Sort planets by number of satellites
            planets.sort((p1, p2) -> Integer.compare(p1.getNumberOfSatellites(), p2.getNumberOfSatellites()));
            System.out.println("\nPlanets sorted by number of satellites:");
            printPlanets(planets);
        }

        private static void printPlanets(ArrayList<PlanetsList.Planet> planets) {
            for (PlanetsList.Planet planet : planets) {
                System.out.println(planet);
            }
        }

}
*/