package entities;

import java.util.ArrayList;
import java.util.List;

public class Food extends Product {

    private String expirationDateForFood;
    List<Food> foods = new ArrayList<>();

    public Food(String name, String brand, double price, int quantity, String purchaseDate, String expirationDateForFood, List<Food> foods) {
        super(name, brand, price, quantity, purchaseDate);
        this.expirationDateForFood = expirationDateForFood;
        this.foods = foods;
    }

    public String getExpirationDateForFood() {
        return expirationDateForFood;
    }

    public void setExpirationDateForFood(String expirationDateForFood) {
        this.expirationDateForFood = expirationDateForFood;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }
}
