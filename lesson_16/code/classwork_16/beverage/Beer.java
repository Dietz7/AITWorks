package classwork_16.beverage;

public class Beer extends Beverage{

    private boolean isDraft;

    private String sort;

    public Beer(String type, boolean isAlcohol, String title, int quantity, String packing, boolean isDraft, String sort) {
        super(type, isAlcohol, title, quantity, packing);
        this.isDraft = isDraft;
        this.sort = sort;
    }

    public void toBuy(String title, String packing, int quantity) {
        super.toBuy(title, packing, quantity);
        this.sort = sort;
    }

    public void displayStock(){
        super.displayStock();
        System.out.println("This is " + " " + sort + "beer.");
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}

