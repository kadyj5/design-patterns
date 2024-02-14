package pl.edu.wszib;

import pl.edu.wszib.model.builder.Motorcycle;
import pl.edu.wszib.model.singleton.RentalFleet;
import pl.edu.wszib.model.strategy.NormalPriceStrategy;
import pl.edu.wszib.model.strategy.PricingService;
import pl.edu.wszib.model.strategy.SeasonalPriceStrategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Singleton
        RentalFleet rentalFactory = RentalFleet.getInstance();

        //Builder
        rentalFactory.addMotorcycle(Motorcycle.builder(2021, "Honda")
                .model("CB500R")
                .build());
        rentalFactory.addMotorcycle(Motorcycle.builder(2001, "Yamaha")
                .model("R6")
                .build());

        int month = 0;
        int days = 0;
        double price = 0;
        do {
            System.out.println("Give the month in witch the motorcycle is being requested: ");
            Scanner scanner = new Scanner(System.in);
            month = scanner.nextInt();
        } while (month <= 0 || month >= 13);

        do {
            System.out.println("Give amount of days: ");
            Scanner scanner = new Scanner(System.in);
            days = scanner.nextInt();
        } while (days <= 0);

        // Strategy
        if (month > 10 || month < 4) {
            PricingService service = new PricingService(new NormalPriceStrategy());
            price = service.calculatePrice(days);
        } else {
            PricingService service = new PricingService(new SeasonalPriceStrategy());
            price = service.calculatePrice(days);
        }

        System.out.println("Calculated price: " + price + "zl for " + days + "days");


    }
}