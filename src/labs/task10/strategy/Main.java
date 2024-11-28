package labs.task10.strategy;

public class Main {
    public static void main(String[] args) {

        MealOrder order = new MealOrder("Order1", 100.00);

        System.out.println("Standard Pricing: $" + order.calculateFinalPrice());

        order.setPricingStrategy(new LoyaltyDiscount(0.10));
        System.out.println("Loyalty Discount (10%): $" + order.calculateFinalPrice());

        order.setPricingStrategy(new HolidayPromotion(20.00));
        System.out.println("Holiday Promotion ($20 off): $" + order.calculateFinalPrice());
    }
}
