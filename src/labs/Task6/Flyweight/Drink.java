package labs.Task6.Flyweight;

public class Drink implements MealComponent {
    private final String name;

    public Drink(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void serve() {
        System.out.println("Serving drink: " + name);
    }
}