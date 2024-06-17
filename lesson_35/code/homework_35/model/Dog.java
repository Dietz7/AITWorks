package homework_35.model;

public class Dog extends Pet{
    private String weight;

    public Dog(int id, String name, String breed, int daysOfStay, double costPerDay, String weight) {
        super(id, name, breed, daysOfStay, costPerDay);
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public double getTotalCost() {
        double cost = daysOfStay*costPerDay;
        return cost;
    }
}
