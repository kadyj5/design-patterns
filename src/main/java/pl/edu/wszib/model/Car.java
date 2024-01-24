package pl.edu.wszib.model;

import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Singular;
import lombok.NonNull;

import java.util.Map;

@Builder
@Data
@AllArgsConstructor
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
