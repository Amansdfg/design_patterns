package labs.Task6.Flyweight;


public class SideDish implements MealComponent {
    private final String name;

    public SideDish(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void serve() {
        System.out.println("Serving side dish: " + name);
    }
}