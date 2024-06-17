package homework_35.model;

public class Dog extends Pet{
    private double weight;

    public Dog(int id, String name, String breed, int daysOfStay, double costPerDay, double weight) {
        super(id, name, breed, daysOfStay, costPerDay);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public double getTotalCost() {
        double cost = daysOfStay*costPerDay;
        return cost;
    }
}
