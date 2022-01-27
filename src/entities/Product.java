package entities;

import java.time.LocalDate;

public abstract class Product {

    private String name;
    private String brand;
    private double price;
    private int quantity;
    private LocalDate purchaseDate;

    protected Product() {

    }

    protected Product(String name, String brand, double price, int quantity, LocalDate purchaseDate) {
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

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
