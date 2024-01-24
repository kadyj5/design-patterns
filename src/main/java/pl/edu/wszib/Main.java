package pl.edu.wszib;

import pl.edu.wszib.model.Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Car Craft!");
        Car car = Car.builder()
                .name("Supra")
                .brand("Toyota")
                .year(2018)
                .description("Car was deported from USA")
                .ownersAndNumber("Maciej", "222333444")
                .ownersAndNumber("Karolina", "234234234")
                .build();

        System.out.println("Cars in the system: ");
        System.out.println(car);
    }
}