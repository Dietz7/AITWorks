package classwork_16.beverage;

public class Beverage {
    private String type;
    private boolean isAlcohol;
    private String title;

    private int quantity;
    private String packing;

    public Beverage(String type, boolean isAlcohol, String title, int quantity, String packing) {
        this.type = type;
        this.isAlcohol = isAlcohol;
        this.title = title;
        this.quantity = quantity;
        this.packing = packing;
    }
    //empty constructor - select none
    public Beverage() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isAlcohol() {
        return isAlcohol;
    }

    public void setAlcohol(boolean alcohol) {
        isAlcohol = alcohol;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPacking() {
        return packing;
    }

    public void setPacking(String packing) {
        this.packing = packing;
    }

    // method to buy
    public void toBuy (String title, String packing, int quantity) {
        System.out.println("Go to market and buy: " + title + ", " + packing + ", " + quantity + ".");
    }

    // what we have on stock
    public void displayStock(){
        System.out.println("We have: " + title + ", " + packing + ", " + quantity + ".");
    }
}
