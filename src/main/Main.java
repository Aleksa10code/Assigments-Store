package main;

import entities.*;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        LocalDate expire1 = LocalDate.of(2022, Month.JANUARY, 30);
        LocalDate expire2 = LocalDate.of(2022, Month.JANUARY, 29);
        LocalDate expire3 = LocalDate.of(2022, Month.FEBRUARY, 20);

        Food food1 = new Food(expire1, "Plazma", "Bambi", 100.00, 2, today);
        Food food2 = new Food(expire2, "Bread", "Wonder", 50.00, 4, today);
        Food food3 = new Food(expire3, "BigMac", "McDonalds", 55.00, 3, today);

        LocalDate expire4 = LocalDate.of(2022, Month.JANUARY, 30);
        LocalDate expire5 = LocalDate.of(2022, Month.JANUARY, 29);
        LocalDate expire6 = LocalDate.of(2022, Month.FEBRUARY, 20);

        LocalDate productionDate1 = LocalDate.of(2019, 03, 05);

        Beverage beverage1 = new Beverage(expire4, "Whiskey", "JackDaniels", 80.00, 6, today);
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

        double sum = 0;
        double totalDiscount = 0;

        for (int i = 0; i < cart1.getListBuyProducts().size(); i++) {
            print(cart1.getListBuyProducts().get(i).getName() + " " + cart1.getListBuyProducts().get(i).getBrand());
            print(cart1.getListBuyProducts().get(i).getQuantity() + " * " + cart1.getListBuyProducts().get(i).getPrice() + " = " + cart1.getListBuyProducts().get(i).getQuantity() * cart1.getListBuyProducts().get(i).getPrice() + " $");
            print("Discount " + calculateDiscount(cart1.getListBuyProducts().get(i)) + " $");

            print("");

            sum += cart1.getListBuyProducts().get(i).getPrice();
            totalDiscount += calculateDiscount(cart1.getListBuyProducts().get(i));

        }
        print("************************************************************************");
        print("SUBTOTAL: " + sum + " $");
        print("Total Discount: " + totalDiscount + " $");
        print("TOTAL SUM : " + (sum - totalDiscount) + " $");
    }


    public static void print(String text) {
        System.out.println(text);
    }

    public static boolean isWeekend(LocalDate date) {
        DayOfWeek day = date.getDayOfWeek();
        return day.equals(DayOfWeek.SATURDAY) || day.equals(DayOfWeek.SUNDAY);
    }

    public static int daysBetween(LocalDate d1, LocalDate d2) {
        return Period.between(d1, d2).getDays();
    }

    public static double calculateDiscount(Product product) {

        if (product instanceof Food) {
            Food food = (Food) product;
            if (food.getExpirationDateForFood().isEqual(LocalDate.now())) {
                double total = food.getPrice() * food.getQuantity();
                return (total * 50) / 100;
            }

            if (daysBetween(food.getExpirationDateForFood(), LocalDate.now()) <= 5) {
                double total = food.getPrice() * food.getQuantity();
                return (total * 10) / 100;
            }
        }

        if (product instanceof Beverage) {
            Beverage beverage = (Beverage) product;
            if (beverage.getExpirationDateForBeverage().isEqual(LocalDate.now())) {
                double total = beverage.getPrice() * beverage.getQuantity();
                return (total * 50) / 100;
            }

            if (daysBetween(beverage.getExpirationDateForBeverage(), LocalDate.now()) <= 5) {
                double total = beverage.getPrice() * beverage.getQuantity();
                return (total * 10) / 100;
            }
        }

        if (product instanceof Clothing) {
            Clothing clothing = (Clothing) product;
            LocalDate today = LocalDate.now();
            if (!(isWeekend(today))) {
                double total = clothing.getPrice() * clothing.getQuantity();
                return (total * 10) / 100;
            }
        }

        if (product instanceof Appliance) {
            Appliance appliance = (Appliance) product;
            LocalDate today = LocalDate.now();
            if (isWeekend(today) && appliance.getPrice() > 999.00) {
                double total = appliance.getPrice() * appliance.getQuantity();
                return (total * 5) / 100;
            }
        }
        return 0;
    }
}