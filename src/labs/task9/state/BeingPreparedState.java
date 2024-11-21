package labs.task9.state;

public class BeingPreparedState implements OrderState {
    @Override
    public void addMeal(String meal, double price) {
        System.out.println("Cannot add items. The order is being prepared.");
    }

    @Override
    public void removeMeal(String meal, double price) {
        System.out.println("Cannot remove items. The order is being prepared.");
    }

    @Override
    public void nextState(MealOrder order) {
        order.setState(new CompletedState());
        System.out.println("Order is now completed.");
    }

    @Override
    public void previousState(MealOrder order) {
        order.setState(new CreatedState());
        System.out.println("Order is back to the Created state.");
    }

    @Override
    public void displayState() {
        System.out.println("Order State: Being Prepared");
    }
}
