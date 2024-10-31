package labs.Task6.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class MealComponentFactory {
    private static final Map<String, MealComponent> components = new HashMap<>();

    // Factory method to get or create a MealComponent instance
    public static MealComponent getComponent(String type, String name) {
        String key = type + "-" + name;

        // Check if the component already exists
        if (!components.containsKey(key)) {
            switch (type.toLowerCase()) {
                case "main":
                    components.put(key, new MainDish(name));
                    break;
                case "side":
                    components.put(key, new SideDish(name));
                    break;
                case "drink":
                    components.put(key, new Drink(name));
                    break;
                case "topping":
                    components.put(key, new Topping(name));
                    break;
                default:
                    throw new IllegalArgumentException("Unknown component type: " + type);
            }
            System.out.println("Created new component: " + key);
        } else {
            System.out.println("Reusing existing component: " + key);
        }

        return components.get(key);
    }

    // Method to get the total number of unique components created
    public static int getTotalComponents() {
        return components.size();
    }
}
