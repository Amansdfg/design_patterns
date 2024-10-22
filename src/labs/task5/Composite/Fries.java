package labs.task5.Composite;

public class Fries implements Meal {
    private double cost;

    public Fries(double cost) {
        this.cost = cost;
    }

    @Override
    public void display() {
        System.out.println("Fries");
    }

    @Override
    public double getCost() {
        return cost;
    }
}

