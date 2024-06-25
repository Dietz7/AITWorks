package homework_39.planets;

import java.util.ArrayList;
import java.util.Collections;

public class PlanetsList {

    static class Planet implements Comparable<Planet> {
        private String name;
        private double distanceToSun;
        private double mass;
        private int numberOfSatellites;

        public Planet(String name, double distanceToSun, double mass, int numberOfSatellites) {
            this.name = name;
            this.distanceToSun = distanceToSun;
            this.mass = mass;
            this.numberOfSatellites = numberOfSatellites;
        }

        public String getName() {
            return name;
        }

        public double getDistanceToSun() {
            return distanceToSun;
        }

        public double getMass() {
            return mass;
        }

        public int getNumberOfSatellites() {
            return numberOfSatellites;
        }

        @Override
        public int compareTo(Planet o) {
            // Compare based on distance to the Sun
            if (this.distanceToSun < o.distanceToSun) {
                return -1;
            } else if (this.distanceToSun > o.distanceToSun) {
                return 1;
            }

            // If distance to the Sun is the same, compare alphabetically by name
            return this.name.compareTo(o.name);

            // Additional comparisons can be added based on mass and number of satellites if needed
            // Example:
            // if (this.mass < other.mass) {
            //     return -1;
            // } else if (this.mass > other.mass) {
            //     return 1;
            // }
            // return 0;
        }

        @Override
        public String toString() {
            return String.format("Planet{name='%s', distanceToSun=%.2f AU, mass=%.2f Earth masses, numberOfSatellites=%d}",
                    name, distanceToSun, mass, numberOfSatellites);
        }
    }

}
