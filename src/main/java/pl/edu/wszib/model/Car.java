package pl.edu.wszib.model;

import lombok.*;

import java.util.Map;

@Builder
@Data
public class Car {
    @NonNull
    private final String name;
    @NonNull
    private final String brand;
    @NonNull
    private final int year;
    private String description;
    @NonNull
    @Singular
    private Map<String, String> ownersAndNumbers;
}
