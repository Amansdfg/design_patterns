package labs.Task6.Facade;
import labs.Task4.Adapter.InternalOrderService;
import labs.Task4.Adapter.OrderService;
import labs.Tast3.Meal;

//Facade is a structural design pattern that provides a simplified interface to a library, a framework, or any other complex set of classes.

public class RestaurantFacade {
    private OrderService orderService;
    private MealPreparationSystem mealPreparationSystem;

    public RestaurantFacade() {
        this.orderService = new InternalOrderService();
        this.mealPreparationSystem = new MealPreparationSystem();
    }

    // Method to view menu items
    public void viewMenu() {
        System.out.println("Viewing available menu items...");
        System.out.println("- Burger\n- Fries\n- Soda\n- Cake\n- Vegetables");
    }

    // Method to view promotions or combos
    public void viewPromotions() {
        System.out.println("Available promotions and combos:");
        System.out.println("- Combo 1: Burger + Fries + Soda\n- Combo 2: Burger + Cake + Soda");
    }


    public void orderCustomMeal(String main, String side, String drink, String dessert) {
        Meal meal = new Meal.MealBuilder(main)
            .side(side)
            .drink(drink)
            .dessert(dessert)
            .build();

        System.out.println("\nCustomizing your meal: " + meal);
        orderService.placeOrder(meal);
    }

    // Method to prepare a meal with a specific style
    public void prepareMeal(String mealName, String style) {
        mealPreparationSystem.prepareMeal(mealName, style);
    }
}
