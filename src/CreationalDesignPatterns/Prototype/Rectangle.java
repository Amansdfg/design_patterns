package CreationalDesignPatterns.Prototype;

public class Rectangle extends Shape {
    public Rectangle() {
        type="Rectangle";
    }
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
