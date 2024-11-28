package labs.Task4.Bridge;

public class SideDish extends MealType {
    private String dish;

    public SideDish(String dish, PreparationStyle preparationStyle) {
        super(preparationStyle);
        this.dish = dish;
    }

    @Override
    public void prepareMeal() {
        preparationStyle.prepare(dish);
    }
}

