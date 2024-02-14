package pl.edu.wszib.model.strategy;

public class SeasonalPriceStrategy implements PricingStrategy {
    private final double PRICE = 350.0;
    @Override
    public double calculatePrice(int days) {
        System.out.println("Calculating for seasonal price");
        return days * PRICE;
    }
}
