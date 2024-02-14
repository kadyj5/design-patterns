package pl.edu.wszib.model.strategy;

public class PricingService {
    private PricingStrategy strategy;

    public PricingService(PricingStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculatePrice(int days) {
        return this.strategy.calculatePrice(days);
    }

}
