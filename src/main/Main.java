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

        Food food1 = new Food(expire1, "Plazma", "Bambi", 100.00, 2, today);
        Food food2 = new Food(expire2, "Bread", "Bread", 50.00, 4, today);
        Food food3 = new Food(expire3, "Jafa", "Jafa", 55.00, 3, today);

        @Deprecated
        Date expire4 = new Date(2022, 04, 25);
        @Deprecated
        Date expire5 = new Date(2022, 05, 15);
        @Deprecated
        Date expire6 = new Date(2019, 03, 05);
        @Deprecated
        Date productionDate1 = new Date(2019, 03, 05);

        Beverage beverage1 = new Beverage(expire4, "Ultra", "Ultra", 80.00, 6, today);
        Beverage beverage2 = new Beverage(expire5, "Guarana", "Guarana", 80.00, 7, today);
        Beverage beverage3 = new Beverage(expire6, "Coca-Cola", "Coca-Cola", 120.00, 10, today);

        Clothing clothing1 = new Clothing(Size.L, "red", "T-Shirt", "Adidas", 23000.00, 1, today);

        Appliance appliance1 = new Appliance("Laptop", productionDate1, 0.3, "Asus ZenBook", "Asus", 120000.00, 1, today);

        Cart c1 = new Cart();
        c1.addProduct(food1);
        c1.addProduct(food2);
        c1.addProduct(food3);
        c1.addProduct(beverage1);
        c1.addProduct(beverage2);
        c1.addProduct(beverage3);
        c1.addProduct(clothing1);
        c1.addProduct(appliance1);

        LocalDateTime dateAndTimeOfPurchase = LocalDateTime.now();
        DateTimeFormatter formatDateAndTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = dateAndTimeOfPurchase.format(formatDateAndTime);

        System.out.println(formattedDate);
        System.out.println("-------- PRODUCTS -------");
        for (int i = 0; i < c1.getListBuyProducts().size(); i++) {
            System.out.println(c1.getListBuyProducts().get(i).getName() + " " + c1.getListBuyProducts().get(i).getBrand());
            System.out.println(c1.getListBuyProducts().get(i).getQuantity() + " * " + c1.getListBuyProducts().get(i).getPrice() + " = " + c1.getListBuyProducts().get(i).getQuantity() * c1.getListBuyProducts().get(i).getPrice());
            System.out.println("Discount " + saleClothinAppliances(c1.getListBuyProducts().get(i).getPrice(), isWeekend(today)));
            System.out.println("************************************************************************");

            double sum = 0;
            for (int j = 0; j < c1.getListBuyProducts().size(); j++) {
                sum += c1.getListBuyProducts().get(j).getPrice();

            }
            System.out.println("Total: " + sum);
            System.out.println("Total Discount: " + (sum - saleClothinAppliances(c1.getListBuyProducts().get(i).getPrice(), isWeekend(today))));
        }
    }

    public static boolean isWeekend(Date date) {
        Calendar c1 = Calendar.getInstance();
        c1.setTime(date);
        System.out.println(c1.get(Calendar.DAY_OF_WEEK));
        if (c1.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY
                || c1.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            return true;
        } else {
            return false;
        }
    }

    public static long daysBetween(Date d1, Date d2) {
        long diff = d2.getTime() - d1.getTime();
        long diffDays = diff / (24 * 60 * 60 * 1000);
        return diffDays;
    }

    public static double saleClothinAppliances(double price, boolean week) {
        if (week == false) {
            double newPrice = price - (price * 0.1);
            return newPrice;
        } else if (week == false && price > 999.00) {
            double newPrice1 = price - (price * 0.5);
            return newPrice1;
        } else {
            return price;
        }
    }
}