package homework_35.model;

import java.util.Objects;

public abstract class Pet {
    protected final int id;
    protected String name;
    protected String breed;
    protected int daysOfStay;
    protected double costPerDay;

    public Pet(int id, String name, String breed, int daysOfStay, double costPerDay) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.daysOfStay = daysOfStay;
        this.costPerDay = costPerDay;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getDaysOfStay() {
        return daysOfStay;
    }

    public void setDaysOfStay(int daysOfStay) {
        this.daysOfStay = daysOfStay;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet pet)) return false;
        return id == pet.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Pet");
        sb.append(" id = ").append(id);
        sb.append(", name ").append(name);
        sb.append(", breed ").append(breed);
        sb.append(", days of stay ").append(daysOfStay);
        sb.append(", costPerDay ").append(costPerDay);
        sb.append(", cost ").append(getTotalCost());
        return sb.toString();
    }

    public abstract double getTotalCost();
}
