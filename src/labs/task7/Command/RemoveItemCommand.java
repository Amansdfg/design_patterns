package labs.task7.Command;

import labs.task7.Meal;
public class RemoveItemCommand implements Command {
    private Meal meal;
    private String item;

    public RemoveItemCommand(Meal meal, String item) {
        this.meal = meal;
        this.item = item;
    }

    @Override
    public void execute() {
        meal.removeItem(item);
    }

    @Override
    public void undo() {
        meal.addItem(item);
    }
}