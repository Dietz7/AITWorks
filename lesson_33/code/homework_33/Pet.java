package homework_33;

abstract class Pet {
    private String name;
    private String breed;
    private int daysOfStay;
    private double costPerDay;

    public Pet(String name, String breed, int daysOfStay, double costPerDay) {
        this.name = name;
        this.breed = breed;
        this.daysOfStay = daysOfStay;
        this.costPerDay = costPerDay;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getDaysOfStay() {
        return daysOfStay;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    public double getTotalCost() {
        return daysOfStay * costPerDay;
    }

    @Override
    public String toString() {
        return "Pet{name='" + name + "', breed='" + breed + "', daysOfStay=" + daysOfStay + ", costPerDay=" + costPerDay + '}';
    }
}

class Cat extends Pet {
    public Cat(String name, String breed, int daysOfStay, double costPerDay) {
        super(name, breed, daysOfStay, costPerDay);
    }
}

class Dog extends Pet {
    public Dog(String name, String breed, int daysOfStay, double costPerDay) {
        super(name, breed, daysOfStay, costPerDay);
    }
}
