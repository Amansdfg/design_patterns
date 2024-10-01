package CreationalDesignPatterns.Task2;

public class Test {
    public static void main(String[] args) {
        ShapeFactory smallShapeFactory=new SmallShapeFactory();
        ShapeDrawingApp smallShapeDrawingApp=new ShapeDrawingApp(smallShapeFactory);
        smallShapeDrawingApp.draw();

        ShapeFactory mediumShapeFactory=new MediumShapeFactory();
        ShapeDrawingApp mediumShapeDrawingApp=new ShapeDrawingApp(mediumShapeFactory);
        mediumShapeDrawingApp.draw();

        ShapeFactory largeShapeFactory=new LargeShapeFactory();
        ShapeDrawingApp largeShapeDrawingApp=new ShapeDrawingApp(largeShapeFactory);
        largeShapeDrawingApp.draw();
    }
}
