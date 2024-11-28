package labs.task10.strategy;

public class MealOrder {
    private String orderId;
    private double basePrice;
    private PricingStrategy pricingStrategy;

    public MealOrder(String orderId, double basePrice) {
        this.orderId = orderId;
        this.basePrice = basePrice;
        this.pricingStrategy = new StandardPricing();
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double calculateFinalPrice() {
        return pricingStrategy.calculatePrice(basePrice);
    }


}
