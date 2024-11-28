package labs.task10.strategy;

public class HolidayPromotion implements PricingStrategy {
    private final double discountAmount;

    public HolidayPromotion(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public double calculatePrice(double basePrice) {
        return Math.max(0, basePrice - discountAmount);
    }
}
