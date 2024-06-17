package homework_35.model;

public class Cat extends Pet{
    private String colour;

    public Cat(int id, String name, String breed, int daysOfStay, double costPerDay, String colour) {
        super(id, name, breed, daysOfStay, costPerDay);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }


    @Override
    public double getTotalCost() {
        double cost = daysOfStay*costPerDay;
        return cost;
    }
}
