package main;

import entities.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import static java.util.concurrent.TimeUnit.DAYS;
import javax.xml.crypto.Data;
import entities.Appliance;
import entities.Beverage;
import entities.Cart;
import entities.Clothing;
import entities.Food;
import entities.Product;
import entities.Size;

public class Main {
    public static void main(String[] args) {

        Date today = Calendar.getInstance().getTime();
        @Deprecated
        Date expire1 = new Date(2022, 04, 25);
        @Deprecated
        Date expire2 = new Date(2022, 05, 15);
        @Deprecated
        Date expire3 = new Date(2022, 03, 05);

        Food food1 = new Food(expire1, "Plazma", "Bambi", 100.00, 10, today);
        Food food2 = new Food(expire2, "Bread", "Bread", 50.00, 5, today);
        Food food3 = new Food(expire3, "Jafa", "Jafa", 55.00, 4, today);

        @Deprecated
        Date expire4 = new Date(2022, 04, 25);
        @Deprecated
        Date expire5 = new Date(2022, 05, 15);
        @Deprecated
        Date expire6 = new Date(2019, 03, 05);

        Beverage beverage1 = new Beverage(expire4, "Ultra", "Guarana", 100.00, 5, today);
        Beverage beverage2 = new Beverage(expire5, "Beer", "Amstel", 60.00, 6, today);
        Beverage beverage3 = new Beverage(expire6, "Whiskey", "Jack Daniels", 200.00, 8, today);

        Clothing clothing1 = new Clothing(Size.S, "red", "T-shirt", "Gucci", 300.00, 8, today);
        Clothing clothing2 = new Clothing(Size.XL, "blue", "Jacket", "Gucci", 130.00, 6, today);
        Clothing clothing3 = new Clothing(Size.XS, "green", "Trainers", "Gucci", 220.00, 7, today);

        @Deprecated
        Date productionDate1 = new Date(2019, 03, 05);

        Appliance appliance1 = new Appliance("Iphone12", productionDate1, 300.56, "Iphone", "Apple", 120000.00, 1, today);
        
    }
}
