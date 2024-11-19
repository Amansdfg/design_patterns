package labs.task9;

import java.util.ArrayList;
import java.util.List;

public class MealOrder {
    private List<String> items = new ArrayList<>();
    private double totalPrice = 0.0;

    public void addItem(String item, double price) {
        items.add(item);
        totalPrice += price;
    }

    public void removeItem(String item, double price) {
        items.remove(item);
        totalPrice -= price;
    }

    public MealOrderMemento save() {
        return new MealOrderMemento(new ArrayList<>(items), totalPrice); // Save current state
    }

    public void restore(MealOrderMemento memento) {
        this.items = new ArrayList<>(memento.getItems()); // Restore deep copy
        this.totalPrice = memento.getTotalPrice();
    }

    public void displayOrder() {
        System.out.println("Order Items: " + items);
        System.out.println("Total Price: $" + totalPrice);
    }
}
