package main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDateTime dateAndTimeOfPurchase = LocalDateTime.now();
        DateTimeFormatter formatDateAndTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = dateAndTimeOfPurchase.format(formatDateAndTime);

        System.out.println(formattedDate);
        System.out.println("-------- PRODUCTS -------");






    }
}
