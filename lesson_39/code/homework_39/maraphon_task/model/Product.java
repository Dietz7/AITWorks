package homework_39.maraphon_task.model;

import java.util.Objects;

public abstract class Product implements Comparable<Product>{
    protected final int id;
    protected double price;
    protected String name;
    protected String expDate;
    protected long barCode;

    public Product(int id, double price, String name, String expDate, long barCode) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.expDate = expDate;
        this.barCode = barCode;
    }

    public int getId() {
        return id;
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

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Product");
        sb.append(" id = ").append(id);
        sb.append(", price ").append(price);
        sb.append(", name ").append(name);
        sb.append(", expDate ").append(expDate);
        sb.append(", barCode ").append(barCode);
        sb.append(", total cost ").append(getTotalCost());
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return id == product.id &&
                Objects.equals(name, product.name) &&
                Objects.equals(expDate, product.expDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, expDate);
    }

    @Override
    public int compareTo(Product o){
        int res = this.expDate.compareTo(o.expDate);
        if(res == 0){
            res = this.name.compareTo(o.name);
        }
        return res;
    }

    public abstract double getTotalCost();

}
