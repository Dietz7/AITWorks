package homework_39.maraphon_task.model;

public class Food extends Product{

    private String category;


    public Food(int id, double price, String name, String expDate, long barCode, String category) {
        super(id, price, name, expDate, barCode);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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




