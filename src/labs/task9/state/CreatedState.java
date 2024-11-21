package labs.task9.state;



public class CreatedState implements OrderState {
    @Override
    public void addMeal(String meal, double price) {
        System.out.println("Item added: " + meal + " ($" + price + ")");
    }

    @Override
    public void removeMeal(String meal, double price) {
        System.out.println("Item removed: " + meal + " ($" + price + ")");
    }

    @Override
    public void nextState(MealOrder order) {
        order.setState(new BeingPreparedState());
        System.out.println("Order is now being prepared.");
    }

    @Override
    public void previousState(MealOrder order) {
        System.out.println("The order is already in the Created state.");
    }

    @Override
    public void displayState() {
        System.out.println("Order State: Created");
    }
}
