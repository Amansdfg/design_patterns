package labs.task9.observer;


import labs.task9.MealOrderMemento;

import java.util.ArrayList;
import java.util.List;

public class MealOrder {
    private List<String> items = new ArrayList<>();
    private double totalPrice = 0.0;
    private List<OrderObserver> observers = new ArrayList<>();

    public void addItem(String item, double price) {
        items.add(item);
        totalPrice += price;
        notifyObservers("Item added: " + item);
    }

    public void removeItem(String item, double price) {
        items.remove(item);
        totalPrice -= price;
        notifyObservers("Item removed: " + item);
    }

    public MealOrderMemento save() {
        return new MealOrderMemento(new ArrayList<>(items), totalPrice);
    }

    public void restore(MealOrderMemento memento) {
        this.items = new ArrayList<>(memento.getItems());
        this.totalPrice = memento.getTotalPrice();
        notifyObservers("Order restored.");
    }

    public void displayOrder() {
        System.out.println("Order Items: " + items);
        System.out.println("Total Price: $" + totalPrice);
    }

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers(String message) {
        for (OrderObserver observer : observers) {
            observer.update(message, this);
        }
    }
}
