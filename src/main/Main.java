package main;

import entities.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        LocalDate expire1 = LocalDate.of(2022, Month.JANUARY, 30);
        LocalDate expire2 = LocalDate.of(2022, Month.JANUARY, 29);
        LocalDate expire3 = LocalDate.of(2022, Month.FEBRUARY, 20);

        Food food1 = new Food(expire1, "Plazma", "Bambi", 100.00, 2, today);
        Food food2 = new Food(expire2, "Bread", "Bread", 50.00, 4, today);
        Food food3 = new Food(expire3, "Jafa", "Jafa", 55.00, 3, today);

        LocalDate expire4 = LocalDate.of(2022, Month.JANUARY, 30);
        LocalDate expire5 = LocalDate.of(2022, Month.JANUARY, 29);
        LocalDate expire6 = LocalDate.of(2022, Month.FEBRUARY, 20);

        LocalDate productionDate1 = LocalDate.of(2019, 03, 05);

        Beverage beverage1 = new Beverage(expire4, "Ultra", "Ultra", 80.00, 6, today);
        Beverage beverage2 = new Beverage(expire5, "Guarana", "Guarana", 80.00, 7, today);
        Beverage beverage3 = new Beverage(expire6, "Coca-Cola", "Coca-Cola", 120.00, 10, today);

        Clothing clothing1 = new Clothing(Size.L, "red", "T-Shirt", "Adidas", 230.00, 1, today);

        Appliance appliance1 = new Appliance("Laptop", productionDate1, 0.3, "Asus ZenBook", "Asus", 1000.00, 1, today);

        Cart cart1 = new Cart();
        cart1.addProduct(food1);
        cart1.addProduct(food2);
        cart1.addProduct(food3);
        cart1.addProduct(beverage1);
        cart1.addProduct(beverage2);
        cart1.addProduct(beverage3);
        cart1.addProduct(clothing1);
        cart1.addProduct(appliance1);

        LocalDateTime dateAndTimeOfPurchase = LocalDateTime.now();
        DateTimeFormatter formatDateAndTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = dateAndTimeOfPurchase.format(formatDateAndTime);

        print("Date: " + formattedDate);
        print("-------- PRODUCTS -------");
        for (int i = 0; i < cart1.getListBuyProducts().size(); i++) {
            print(cart1.getListBuyProducts().get(i).getName() + " " + cart1.getListBuyProducts().get(i).getBrand());
            print(cart1.getListBuyProducts().get(i).getQuantity() + " * " + cart1.getListBuyProducts().get(i).getPrice() + " = " + cart1.getListBuyProducts().get(i).getQuantity() * cart1.getListBuyProducts().get(i).getPrice());
            print("Discount " + (cart1.getListBuyProducts().get(i).getPrice() - (saleClothinAppliances(cart1.getListBuyProducts().get(i).getPrice(), isWeekend(today)))));
            print("************************************************************************");

            double sum = 0;
            for (int j = 0; j < cart1.getListBuyProducts().size(); j++) {
                sum = sum + cart1.getListBuyProducts().get(j).getPrice();
            }
            print("SUBTOTAL: " + sum);
            print("Total Discount: " + (sum - saleClothinAppliances(cart1.getListBuyProducts().get(i).getPrice(), isWeekend(today))));
            print("TOTAL SUM : " + (sum - (sum - saleClothinAppliances(cart1.getListBuyProducts().get(i).getPrice(), isWeekend(today)))));
        }
    }

    public static void print(String text) {
        System.out.println(text);
    }

    public static boolean isWeekend(LocalDate date) {
        DayOfWeek day = date.getDayOfWeek();
        return day.equals(DayOfWeek.SATURDAY) || day.equals(DayOfWeek.SUNDAY);
    }

    public static long daysBetween(Date d1, Date d2) {
        long diff = d2.getTime() - d1.getTime();
        long diffDays = diff / (24 * 60 * 60 * 1000);
        return diffDays;
    }

    public static double saleClothinAppliances(double price, boolean week) {

        if (week == false) {
            double newPrice = price - (price * 0.10);
            return newPrice;
        } else if (week == true && price > 999.00) {
            double newPrice1 = price - (price * 0.5);
            return newPrice1;
        } else {
            return price;
        }
    }
}