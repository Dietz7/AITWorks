package homework_39.maraphon_task.model;

public class MilkFood extends Product{

    private String milkType;
    private double fat;

    public MilkFood(double price, String name, long barCode, String milkType, double fat) {
        super(price, name, barCode);
        this.milkType = milkType;
        this.fat = fat;
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    @Override
    public String toString() {
        return "MilkFood{" +
                "milkType='" + milkType + '\'' +
                ", fat=" + fat +
                '}';
    }
}
