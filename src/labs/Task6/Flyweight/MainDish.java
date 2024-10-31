package labs.Task6.Flyweight;

// Concrete Flyweight for Main Dish
public class MainDish implements MealComponent {
    private final String name;

    public MainDish(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void serve() {
        System.out.println("Serving main dish: " + name);
    }
}
