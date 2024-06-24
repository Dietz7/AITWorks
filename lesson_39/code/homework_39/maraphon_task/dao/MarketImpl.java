package homework_39.maraphon_task.dao;

import homework_39.maraphon_task.model.Product;

public class MarketImpl implements SuperMarket{

    private Product[] products;
    private int size;

    public MarketImpl(int capacity){
        products = new Product[capacity];
        size = 0;
    }
    @Override
    public boolean addProduct(Product product) {
        if(product == null || size == products.length || findProduct(product.getId()) != null){
            return false;
        }
        products[size++] = product;
        return true;
    }

    @Override
    public Product removeProduct(int id) {
        for (int i = 0; i < size; i++) {
            if(products[i].getId() == id){
                Product victim = products[i];
                products[i] = products[size--];
                products[size] = null;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Product findProduct(int id) {
        for (int i = 0; i < size; i++) {
            if(products[i].getId() == id) {
                return products[i];
            }
        }
        return null;
    }

    @Override
    public Product findProductByExpDate(String expDate) {
        for (int i = 0; i < size; i++) {
            if(products[i].getExpDate().equals(expDate)){
              return products[i];
            }
        }
        return null;
    }

    @Override
    public double getTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < size; i++) {
            totalCost += products[i].getPrice();
        }
        return totalCost;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printProduct() {
        for (int i = 0; i < size; i++) {
            System.out.println(products[i]);
        }
    }
}
