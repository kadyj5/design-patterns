package pl.edu.wszib.model.singleton;

import pl.edu.wszib.model.builder.Motorcycle;

import java.util.ArrayList;
import java.util.List;

public class RentalFleet {
    private static RentalFleet INSTANCE = new RentalFleet();
    private List<Motorcycle> motorcycles = new ArrayList<>();

    private RentalFleet() {
        if (INSTANCE != null) {
            throw new IllegalStateException("Instance already exists!");
        }
    }

    public static RentalFleet getInstance() {
        return INSTANCE;
    }

    public void addMotorcycle(Motorcycle motorcycle) {
        motorcycles.add(motorcycle);
    }

    public List<Motorcycle> getMotorcycles() {
        return new ArrayList<>(motorcycles);
    }


    @Override
    public String toString() {
        return "RentalFactory{" +
                "motorcycles=" + motorcycles +
                '}';
    }
}
