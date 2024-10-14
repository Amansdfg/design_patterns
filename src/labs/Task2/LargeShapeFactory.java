package labs.Task2;

public class LargeShapeFactory implements ShapeFactory{
    @Override
    public Circle createCircle() {
        return new LargeCircle();
    }

    @Override
    public Rectangle createRectangle() {
        return new LargeRectangle();
    }

    @Override
    public Square createSquare() {
        return new LargeSquare();
    }
}
