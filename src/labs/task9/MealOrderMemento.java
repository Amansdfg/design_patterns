package labs.task9;

import java.util.ArrayList;
import java.util.List;

public class MealOrderMemento {
    private final List<String> items;
    private final double totalPrice;

    public MealOrderMemento(List<String> items, double totalPrice) {
        this.items = new ArrayList<>(items);
        this.totalPrice = totalPrice;
    }

    public List<String> getItems() {
        return new ArrayList<>(items);
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
