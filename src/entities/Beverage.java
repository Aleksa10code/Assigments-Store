package entities;

import java.util.ArrayList;
import java.util.List;

public class Beverage extends Product{

    private String expirationDateForBeverage;
    List<Beverage> beverages = new ArrayList<>();

    public Beverage(String name, String brand, double price, int quantity, String purchaseDate, String expirationDateForBeverage, List<Beverage> beverages) {
        super(name, brand, price, quantity, purchaseDate);
        this.expirationDateForBeverage = expirationDateForBeverage;
        this.beverages = beverages;
    }

    public String getExpirationDateForBeverage() {
        return expirationDateForBeverage;
    }

    public void setExpirationDateForBeverage(String expirationDateForBeverage) {
        this.expirationDateForBeverage = expirationDateForBeverage;
    }

    public List<Beverage> getBeverages() {
        return beverages;
    }

    public void setBeverages(List<Beverage> beverages) {
        this.beverages = beverages;
    }
}
