package labs.task9.observer;

public class CustomerObserver implements OrderObserver {
    private String name;

    public CustomerObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message, MealOrder order) {
        System.out.println("Customer " + name + " notified: " + message);
        order.displayOrder();
    }
}
