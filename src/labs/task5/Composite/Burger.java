package labs.task5.Composite;

public class Burger implements Meal {
    private double cost;

    public Burger(double cost) {
        this.cost = cost;
    }

    @Override
    public void display() {
        System.out.println("Burger");
    }

    @Override
    public double getCost() {
        return cost;
    }
}
