package labs.Task6.Facade;


import java.util.HashMap;
import java.util.Map;

public class MealPreparationSystem {
    private Map<String, String> mealStyles = new HashMap<>();

    public MealPreparationSystem() {
        mealStyles.put("GrilledStyle", "Grilling the meal...");
        mealStyles.put("FriedStyle", "Frying the meal...");
        mealStyles.put("SteamedStyle", "Steaming the meal...");
    }

    public void prepareMeal(String mealName, String style) {
        if (mealStyles.containsKey(style)) {
            System.out.println("Preparing " + mealName + " with " + style + ": " + mealStyles.get(style));
        } else {
            System.out.println("Style not available. Preparing " + mealName + " in default style.");
        }
    }
}
