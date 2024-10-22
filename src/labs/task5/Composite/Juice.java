package labs.task5.Composite;

public class Juice implements Meal{
    private double cost;
    public Juice(double cost){
        this.cost = cost;
    }
    @Override
    public void display() {
        System.out.println("Juice");
    }

    @Override
    public double getCost() {
        return cost;
    }
}
