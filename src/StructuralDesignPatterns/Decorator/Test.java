package StructuralDesignPatterns.Decorator;

/**
 * {@code Decorator}
 *
 * <blockquote><pre>Also known as: Wrapper</pre></blockquote><p>
 *  Intent
 * Decorator is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.
 *
 * @author Aman
 */


public class Test {
    public static void main(String[] args) {
        Coffee myCoffee = new SimpleCoffee();
        System.out.println(myCoffee.getDescription() + " => $" + myCoffee.cost());


        myCoffee = new MilkDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " => $" + myCoffee.cost());

        myCoffee = new SugarDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " => $" + myCoffee.cost());
    }
}
