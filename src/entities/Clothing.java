package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Clothing extends Product {

    private Size size;
    private String color;
    private List<Clothing> clothes = new ArrayList<>();

    protected Clothing() {

    }

    protected Clothing(Size size, String color) {
        this.size = size;
        this.color = color;
    }

    public Clothing(Size size, String color, String name, String brand, double price, int quantity, LocalDate purchaseDate) {
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
