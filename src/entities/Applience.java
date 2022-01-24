package entities;

import java.util.ArrayList;
import java.util.List;

public class Applience extends Product {

    private String model;
    private String productionDate;
    private double weight;
    private Week week;
    List<Applience> appliences = new ArrayList<>();

    public Applience(String name, String brand, double price, int quantity, String purchaseDate, String model, String productionDate, double weight, Week week, List<Applience> appliences) {
        super(name, brand, price, quantity, purchaseDate);
        this.model = model;
        this.productionDate = productionDate;
        this.weight = weight;
        this.week = week;
        this.appliences = appliences;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Week getWeek() {
        return week;
    }

    public void setWeek(Week week) {
        this.week = week;
    }

    public List<Applience> getAppliences() {
        return appliences;
    }

    public void setAppliences(List<Applience> appliences) {
        this.appliences = appliences;
    }
}
