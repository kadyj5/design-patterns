package pl.edu.wszib.model.strategy;

public class NormalPriceStrategy implements PricingStrategy {
    private final double PRICE = 250.0;

    @Override
    public double calculatePrice(int days) {
        System.out.println("Calculating for normal season price");
        return days * PRICE;
    }
}
