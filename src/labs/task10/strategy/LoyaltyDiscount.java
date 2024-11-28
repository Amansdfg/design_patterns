package labs.task10.strategy;

public class LoyaltyDiscount implements PricingStrategy {
    private final double discountRate;

    public LoyaltyDiscount(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public double calculatePrice(double basePrice) {
        return basePrice * (1 - discountRate);
    }
}
