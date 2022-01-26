package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Clothing extends Product {

    private Size size;
    private String color;
    List<Clothing> clothes = new ArrayList<>();

    public Clothing() {

    }

    protected Clothing(String name, String brand, double price, int quantity, Date purchaseDate, Size size, String color) {
        super(name, brand, price, quantity, purchaseDate);
        this.size = size;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Clothing> getClothes() {
        return clothes;
    }

    public void setClothes(List<Clothing> clothes) {
        this.clothes = clothes;
    }
}
