package entities;

import java.util.Date;

public abstract class Product {

    private String name;
    private String brand;
    private double price;
    private int quantity;
    private Date purchaseDate;

    public Product() {

    }

    protected Product(String name, String brand, double price, int quantity, Date purchaseDate) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
        this.purchaseDate = purchaseDate;
    }
}
