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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
