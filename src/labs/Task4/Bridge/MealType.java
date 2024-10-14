package labs.Task4.Bridge;
public abstract class MealType {
    protected PreparationStyle preparationStyle;

    public MealType(PreparationStyle preparationStyle) {
        this.preparationStyle = preparationStyle;
    }

    public abstract void prepareMeal();
}
