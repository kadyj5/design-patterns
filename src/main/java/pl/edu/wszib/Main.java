package pl.edu.wszib;

import pl.edu.wszib.model.Car;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Car Craft!");
        List<Car> cars = new ArrayList<>();
        cars.add(Car.builder()
                .name("Supra")
                .brand("Toyota")
                .year(2018)
                .description("Car was deported from USA")
                .ownersAndNumber("Maciej", "222333444")
                .ownersAndNumber("Karolina", "234234234")
                .build());
        cars.add(Car.builder()
                .name("Corolla")
                .brand("Toyota")
                .year(2012)
                .ownersAndNumber("Gabrysia", "123123123")
                .build());

        System.out.println("Cars in the system: ");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}