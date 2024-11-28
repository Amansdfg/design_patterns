package StructuralDesignPatterns.Adapter;

public class SquarePeg {
    private double width;
    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
    public double getSquare() {
        return width * width;
    }
}
