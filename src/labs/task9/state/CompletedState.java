package labs.task9.state;

public class CompletedState implements OrderState {
    @Override
    public void addMeal(String meal, double price) {
        System.out.println("Cannot add items. The order is completed.");
    }

    @Override
    public void removeMeal(String meal, double price) {
        System.out.println("Cannot remove items. The order is completed.");
    }

    @Override
    public void nextState(MealOrder order) {
        System.out.println("The order is already in the Completed state.");
    }

    @Override
    public void previousState(MealOrder order) {
        order.setState(new BeingPreparedState());
        System.out.println("Order is back to Being Prepared.");
    }

    @Override
    public void displayState() {
        System.out.println("Order State: Completed");
    }
}
