package labs.task9.state;

public class Main {
    public static void main(String[] args) {
        MealOrder mealOrder = new MealOrder();

        mealOrder.displayState();

        mealOrder.addMeal("Burger", 5.99);
        mealOrder.addMeal("Fries", 2.99);

        mealOrder.nextState();
        mealOrder.displayState();

        mealOrder.addMeal("Drink", 1.49);
        mealOrder.removeMeal("Fries", 2.99);

        mealOrder.nextState();
        mealOrder.displayState();

        mealOrder.previousState();
        mealOrder.displayState();
    }
}
