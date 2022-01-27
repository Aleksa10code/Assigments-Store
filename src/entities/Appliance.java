package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Appliance extends Product {

    private String model;
    private LocalDate productionDate;
    private double weight;
    private List<Appliance> appliances = new ArrayList<>();

    protected Appliance() {

    }

    protected Appliance(String model, LocalDate productionDate, double weight) {
        this.model = model;
        this.productionDate = productionDate;
        this.weight = weight;

    }

    public Appliance(String model, LocalDate productionDate, double weight, String name, String brand, double price, int quantity, LocalDate purchaseDate) {
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

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
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
