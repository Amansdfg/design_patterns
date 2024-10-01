package CreationalDesignPatterns.Task2;

public class SmallShapeFactory implements ShapeFactory {
    @Override
    public Circle createCircle() {
        return new SmallCircle();
    }

    @Override
    public Rectangle createRectangle() {
        return new SmallRectangle();
    }

    @Override
    public Square createSquare() {
        return new SmallSquare();
    }
}
