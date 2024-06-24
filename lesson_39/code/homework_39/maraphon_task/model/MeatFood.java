package homework_39.maraphon_task.model;

public class MeatFood extends Product{
    private String meatType;

    public MeatFood(int id, double price, String name, String expDate,  long barCode, String meatType) {
        super(id, price, name, expDate, barCode);
        this.meatType = meatType;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    public double getTotalPrice(Product[] products){
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

