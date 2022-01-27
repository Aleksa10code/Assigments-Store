package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Beverage extends Product {

    private LocalDate expirationDateForBeverage;
    private List<Beverage> beverages = new ArrayList<>();

    public Beverage() {
    }

    public Beverage(LocalDate expirationDateForBeverage) {
        this.expirationDateForBeverage = expirationDateForBeverage;
    }

    public Beverage(LocalDate expirationDateForBeverage, String name, String brand, double price, int quantity, LocalDate purchaseDate) {
        super(name, brand, price, quantity, purchaseDate);
        this.expirationDateForBeverage = expirationDateForBeverage;
    }

    public LocalDate getExpirationDateForBeverage() {
        return expirationDateForBeverage;
    }

    public void setExpirationDateForBeverage(LocalDate expirationDateForBeverage) {
        this.expirationDateForBeverage = expirationDateForBeverage;
    }

    public List<Beverage> getBeverages() {
        return beverages;
    }

    public void setBeverages(List<Beverage> beverages) {
        this.beverages = beverages;
    }
}
