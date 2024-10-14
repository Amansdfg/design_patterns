package labs.Task4.Adapter;

import labs.Tast3.Meal;

public class MealOrderSystem {
    public static void main(String[] args) {
        Meal meal = new Meal.MealBuilder("Burger").side("Fries").drink("Soda").dessert("Cake").build();
        System.out.println("\nMeal: " + meal);

        // Internal order service
        OrderService internalService = new InternalOrderService();
        internalService.placeOrder(meal);

        // External delivery service using adapter
        ExternalDeliveryService externalService = new ExternalDeliveryService();
        OrderService externalAdapter = new ExternalOrderAdapter(externalService);
        externalAdapter.placeOrder(meal);
    }
}

