package homework.supermarkt.model.parent;

public class Product {
    private double price;
    private String name;
    private long barCode;

    public Product(double price, String name, long barCode) {
        this.price = price;
        this.name = name;
        this.barCode = barCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", barCode=" + barCode +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // esli eto tot produkt kotoruj mu i ischem, to vozvraschajem true
        if (o == null || getClass() != o.getClass()) return false; // ne iz naschego klassa return false
        Product product = (Product) o; // delajem casting do nuzhnogo nam klassa Product
        return barCode == product.barCode; // sravnivajem barCodu
    }

    @Override
    public int hashCode() {
        return (int) (barCode ^ (barCode >>> 32));
    }
}
