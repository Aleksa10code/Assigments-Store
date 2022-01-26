package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Appliance extends Product {

    private String model;
    private Date productionDate;
    private double weight;
    List<Appliance> appliances = new ArrayList<>();

    public Appliance() {

    }

    public Appliance(String model, Date productionDate, double weight, Week week) {
        this.model = model;
        this.productionDate = productionDate;
        this.weight = weight;

    }

    public Appliance(String model, Date productionDate, double weight, String name, String brand, double price, int quantity, Date purchaseDate) {
        super(name, brand, price, quantity, purchaseDate);
        this.model = model;
        this.productionDate = productionDate;
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public List<Appliance> getAppliances() {
        return appliances;
    }

    public void setAppliances(List<Appliance> appliances) {
        this.appliances = appliances;
    }
}
