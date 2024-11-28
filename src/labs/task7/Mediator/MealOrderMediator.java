package labs.task7.Mediator;

import labs.task7.Command.Command;
import labs.task7.Command.OrderManager;
import labs.task7.Iterator.MealIterator;
import labs.task7.Meal;

public class MealOrderMediator implements Mediator {
    private Meal meal;
    private OrderManager orderManager;

    public MealOrderMediator(Meal meal, OrderManager orderManager) {
        this.meal = meal;
        this.orderManager = orderManager;
    }

    @Override
    public void executeCommand(Command command) {
        orderManager.executeCommand(command);
    }

    @Override
    public void undoCommand() {
        orderManager.undo();
    }

    @Override
    public void redoCommand() {
        orderManager.redo();
    }

    @Override
    public void displayOrder() {
        MealIterator iterator = meal.getIterator();
        System.out.println("Current Meal Order:");
        while (iterator.hasNext()) {
            System.out.println("- " + iterator.next());
        }
    }
}
