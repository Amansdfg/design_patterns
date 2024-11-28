package labs.Task4.Bridge;

public class MainDish extends MealType {
    private String dish;

    public MainDish(String dish, PreparationStyle preparationStyle) {
        super(preparationStyle);
        this.dish = dish;
    }

    @Override
    public void prepareMeal() {
        preparationStyle.prepare(dish);
    }
}
