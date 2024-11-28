package StructuralDesignPatterns.Adapter;

public class RoundHole {
    private  int radius;
    public RoundHole (int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public boolean fits(RoundPeg peg) {
        boolean result;
        result=this.getRadius()>=peg.getRadius();
        return result;

    }
}
