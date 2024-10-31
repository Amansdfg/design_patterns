package labs.Task6.Facade;

public class MealOrderSystem {
    public static void main(String[] args) {
        RestaurantFacade restaurantFacade = new RestaurantFacade();

        // Viewing the menu and promotions
        restaurantFacade.viewMenu();
        restaurantFacade.viewPromotions();

        // Ordering a custom meal
        restaurantFacade.orderCustomMeal("Burger", "Fries", "Soda", "Cake");

        // Preparing a specific style meal
        restaurantFacade.prepareMeal("Burger", "GrilledStyle");
    }
}

