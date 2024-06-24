package homework_39.maraphon_task.model;

public class MilkFood extends Product{

    private String milkType;
    private double fat;

    public MilkFood(int id, double price, String name, String expDate, long barCode, String milkType, double fat) {
        super(id, price, name, expDate,  barCode);
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

    public double getTotalPrice(Product[] products) {
        double res = 0;
        for (int i = 0; i < products.length; i++) {
            res += products[i].getPrice();
        }
        return res;
    }

    private Product[] products;
    private int size;
    @Override
    public double getTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < size; i++) {
            totalCost += products[i].getPrice();
        }
        return totalCost;
    }
}
