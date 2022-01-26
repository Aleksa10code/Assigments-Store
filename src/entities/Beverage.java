package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Beverage extends Product {

    private Date expirationDateForBeverage;
    List<Beverage> beverages = new ArrayList<>();

    public Beverage() {
    }

    public Beverage(Date expirationDateForBeverage) {
        this.expirationDateForBeverage = expirationDateForBeverage;
    }

    public Beverage(Date expirationDateForBeverage, String name, String brand, double price, int quantity, Date purchaseDate) {
        super(name, brand, price, quantity, purchaseDate);
        this.expirationDateForBeverage = expirationDateForBeverage;
    }

    public Date getExpirationDateForBeverage() {
        return expirationDateForBeverage;
    }

    public void setExpirationDateForBeverage(Date expirationDateForBeverage) {
        this.expirationDateForBeverage = expirationDateForBeverage;
    }

    public List<Beverage> getBeverages() {
        return beverages;
    }

    public void setBeverages(List<Beverage> beverages) {
        this.beverages = beverages;
    }
}
