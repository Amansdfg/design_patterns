package CreationalDesignPatterns.Task2;

public class MediumShapeFactory implements ShapeFactory{
    @Override
    public Circle createCircle() {
        return new MediumCircle();
    }

    @Override
    public Rectangle createRectangle() {
        return new MediumRectangle();
    }

    @Override
    public Square createSquare() {
        return new MediumSquare();
    }
}
