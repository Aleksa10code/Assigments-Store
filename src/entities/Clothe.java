package entities;

import java.util.ArrayList;
import java.util.List;

public class Clothe extends Product {

    private Size size;
    private String color;
    private Week week;
    List<Clothe> clothes = new ArrayList<>();

    public Clothe(String name, String brand, double price, int quantity, String purchaseDate, Size size, String color, Week week, List<Clothe> clothes) {
        super(name, brand, price, quantity, purchaseDate);
        this.size = size;
        this.color = color;
        this.week = week;
        this.clothes = clothes;
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

    public Week getWeek() {
        return week;
    }

    public void setWeek(Week week) {
        this.week = week;
    }

    public List<Clothe> getClothes() {
        return clothes;
    }

    public void setClothes(List<Clothe> clothes) {
        this.clothes = clothes;
    }
}
