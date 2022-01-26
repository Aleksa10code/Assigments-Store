package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Food extends Product {

    private Date expirationDateForFood;
    List<Food> foods = new ArrayList<>();

    public Food() {

    }

    protected Food(Date expirationDateForFood) {
        this.expirationDateForFood = expirationDateForFood;
    }

    public Food(Date expirationDateForFood, String name, String brand, double price, int quantity, Date purchaseDate) {
        super(name, brand, price, quantity, purchaseDate);
        this.expirationDateForFood = expirationDateForFood;
    }

    public Date getExpirationDateForFood() {
        return expirationDateForFood;
    }

    public void setExpirationDateForFood(Date expirationDateForFood) {
        this.expirationDateForFood = expirationDateForFood;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }
}
