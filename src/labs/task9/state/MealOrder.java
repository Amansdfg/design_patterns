package labs.task9.state;

public class MealOrder {
    private OrderState currentState;

    public MealOrder() {
        this.currentState = new CreatedState();
    }

    public void setState(OrderState state) {
        this.currentState = state;
    }

    public void addMeal(String item, double price) {
        currentState.addMeal(item, price);
    }

    public void removeMeal(String item, double price) {
        currentState.removeMeal(item, price);
    }

    public void nextState() {
        currentState.nextState(this);
    }

    public void previousState() {
        currentState.previousState(this);
    }

    public void displayState() {
        currentState.displayState();
    }
}
