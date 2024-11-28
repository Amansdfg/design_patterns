package labs.Task2;

public class ShapeDrawingApp {
    private Circle circle;
    private Rectangle rectangle;
    private Square square;
    public ShapeDrawingApp(ShapeFactory shapeFactory) {
        this.circle = shapeFactory.createCircle();
        this.rectangle = shapeFactory.createRectangle();
        this.square = shapeFactory.createSquare();
    }
    public void draw(){
        circle.drawCircle();
        rectangle.drawRectangle();
        square.drawSquare();
        System.out.println();
    }
}
