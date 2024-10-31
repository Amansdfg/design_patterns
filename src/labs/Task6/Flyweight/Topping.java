package labs.Task6.Flyweight;

public class Topping implements MealComponent {
    private final String name;

    public Topping(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void serve() {
        System.out.println("Adding topping: " + name);
    }
}