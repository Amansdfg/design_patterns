package labs.task7.Command;

import labs.task7.Meal;

public class AddItemCommand implements Command {
    private Meal meal;
    private String item;

    public AddItemCommand(Meal meal, String item) {
        this.meal = meal;
        this.item = item;
    }

    @Override
    public void execute() {
        meal.addItem(item);
    }

    @Override
    public void undo() {
        meal.removeItem(item);
    }
}

