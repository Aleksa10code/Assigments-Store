package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Food extends Product {

    private LocalDate expirationDateForFood;
    private List<Food> foods = new ArrayList<>();

    public Food() {

    }

    protected Food(LocalDate expirationDateForFood) {
        this.expirationDateForFood = expirationDateForFood;
    }

    public Food(LocalDate expirationDateForFood, String name, String brand, double price, int quantity, LocalDate purchaseDate) {
        super(name, brand, price, quantity, purchaseDate);
        this.expirationDateForFood = expirationDateForFood;
    }

    public LocalDate getExpirationDateForFood() {
        return expirationDateForFood;
    }

    public void setExpirationDateForFood(LocalDate expirationDateForFood) {
        this.expirationDateForFood = expirationDateForFood;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }
}
