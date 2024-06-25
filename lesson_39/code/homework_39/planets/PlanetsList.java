package homework_39.planets;

import java.util.Objects;

/*Занести планеты солнечной системы в список, содержащий:

наименование;
расстояние до Солнца;
массу;
количество спутников. Вывести список планет отсортированный по:
порядку расположения в солнечной системе;
алфавиту;
массе;
количеству спутников. */
public class PlanetsList {

    static class Planet implements Comparable<Planet> {
        private String name;
        private double distance;
        private double mass;
        private int numberOfSatellites;

        public Planet(String name, double distanceToSun, double mass, int numberOfSatellites) {
            this.name = name;
            this.distance = distance;
            this.mass = mass;
            this.numberOfSatellites = numberOfSatellites;
        }

        public String getName() {
            return name;
        }

        public double getDistance() {
            return distance;
        }

        public double getMass() {
            return mass;
        }

        public int getNumberOfSatellites() {
            return numberOfSatellites;
        }

        @Override
        public String toString() {
            return "Planet{" +
                    "name='" + name + '\'' +
                    ", distance=" + distance +
                    ", mass=" + mass +
                    ", numberOfSatellites=" + numberOfSatellites +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Planet planet = (Planet) o;
            return Objects.equals(name, planet.name);
        }

        @Override
        public int compareTo(Planet o) {
            return Double.compare(this.getDistance(), o.getDistance());
        }
    }

}
