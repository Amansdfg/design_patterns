package StructuralDesignPatterns.Adapter;

public class SquarePegAdapter extends RoundPeg{
    private SquarePeg squarePeg;
    public SquarePegAdapter(SquarePeg squarePeg) {
        super();
        this.squarePeg = squarePeg;
    }
    @Override
    public double getRadius() {
        double result;
        result = (Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2));
        return result;
    }
}
