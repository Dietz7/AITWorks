package classwork_36.city_arrays;

import java.util.Objects;

public class City implements Comparable <City>{
    // fields
    private String name;
    private int population;
    private String country;
    private double index;

    // Constructor

    public City(String name, int population, String country, double index) {
        this.name = name;
        this.population = population;
        this.country = country;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getIndex() {
        return index;
    }

    public void setIndex(double index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", country='" + country + '\'' +
                ", index=" + index +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        //This line checks if the current instance (this) and the object o are the same object in memory.
        //If they are the same object, it returns true because they are obviously equal.
        if (this == o) return true; //Check if this is the same as o:
        //It checks if the object o is an instance of the City class.
        //If o is not an instance of City, it returns false because they cannot be equal.
        //If o is an instance of City, it casts o to a City object and assigns it to the variable city.
        if (!(o instanceof City city)) return false; //Check if o is an instance of City:
        //return Objects.equals(name, city.name) && Objects.equals(country, city.country);
        //This compares the name and country fields of the current instance (this) and the City object o.
        //It uses the equals method to compare the name and country fields.
        //If both name and country fields are equal, it returns true; otherwise, it returns false.
        return this.name.equals(((City) o).name) && this.country.equals(((City) o).country);//Compare the name
        // and country fields:
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country);
    }

    @Override
    public int compareTo(City o) {
        return Integer.compare(this.population, o.population); // native sorting by population

    }

}
