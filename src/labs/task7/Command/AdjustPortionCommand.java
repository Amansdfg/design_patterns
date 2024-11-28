package labs.task7.Command;

import labs.task7.Meal;

public class AdjustPortionCommand implements Command {
    private Meal meal;
    private String item;
    private int newPortion;
    private int oldPortion;

    public AdjustPortionCommand(Meal meal, String item, int newPortion) {
        this.meal = meal;
        this.item = item;
        this.newPortion = newPortion;
        this.oldPortion = meal.getPortion(item);
    }

    @Override
    public void execute() {
        meal.adjustPortion(item, newPortion);
    }

    @Override
    public void undo() {
        meal.adjustPortion(item, oldPortion);
    }
}
