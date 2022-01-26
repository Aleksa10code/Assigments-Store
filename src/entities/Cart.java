package entities;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Product> listBuyProducts = new ArrayList<>();

    public void addProduct(Product product) {
        listBuyProducts.add(product);
    }

    public List<Product> getListBuyProducts() {
        return listBuyProducts;
    }

    public void setListBuyProducts(List<Product> listBuyProducts) {
        this.listBuyProducts = listBuyProducts;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "list of purchased products = " + listBuyProducts +
                '}';
    }
}