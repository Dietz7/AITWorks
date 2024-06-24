package homework_39.maraphon_task.dao;

import homework_39.maraphon_task.model.Product;

public interface SuperMarket {
boolean addProduct(Product product);
Product removeProduct(int id);
Product findProduct(int id);
Product findProductByExpDate(String expDate);
double getTotalCost();
int quantity();
void printProduct();
}
