package labs.task9.state;

public interface OrderState {
    void addMeal(String meal, double price);
    void removeMeal(String meal, double price);
    void nextState(MealOrder order);
    void previousState(MealOrder order);
    void displayState();
}