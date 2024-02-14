package pl.edu.wszib.model.builder;

import pl.edu.wszib.model.builder.MotorcycleBuilder;

public class Motorcycle {
    private int year;
    private String make;
    private String model;

    public static MotorcycleBuilder builder(int year, String make) {
        return new MotorcycleBuilder(year, make);
    }

    public Motorcycle(int year, String make) {
        this.year = year;
        this.make = make;
    }

    public Motorcycle(int year, String make, String model) {
        this.year = year;
        this.make = make;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "year=" + year +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
