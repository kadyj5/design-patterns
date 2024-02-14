package pl.edu.wszib.model.builder;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MotorcycleBuilder {
    private int year;
    private String make;
    private String model;

    public MotorcycleBuilder(int year, String make) {
        this.year = year;
        this.make = make;
    }

    public MotorcycleBuilder year(int year) {
        this.year = year;
        return this;
    }

    public MotorcycleBuilder make(String make) {
        this.make = make;
        return this;
    }

    public MotorcycleBuilder model(String model) {
        this.model = model;
        return this;
    }

    public Motorcycle build() {
        return new Motorcycle(year,make,model);
    }
}
