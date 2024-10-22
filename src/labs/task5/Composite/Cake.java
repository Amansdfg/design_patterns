package labs.task5.Composite;

public class Cake implements Meal {
    private double cost;
    public Cake(double cost){
        this.cost = cost;
    }
    @Override
    public void display() {
        System.out.println("Cake");
    }

    @Override
    public double getCost() {
        return cost;
    }
}
