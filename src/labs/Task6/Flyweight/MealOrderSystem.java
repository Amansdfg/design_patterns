package labs.Task6.Flyweight;

public class MealOrderSystem {
    public static void main(String[] args) {
        // Create or reuse components using the factory
        MealComponent burger = MealComponentFactory.getComponent("main", "Burger");
        MealComponent fries = MealComponentFactory.getComponent("side", "Fries");
        MealComponent soda = MealComponentFactory.getComponent("drink", "Soda");
        MealComponent cheese = MealComponentFactory.getComponent("topping", "Cheese");

        // Serving each component
        burger.serve();
        fries.serve();
        soda.serve();
        cheese.serve();

        // Reuse existing components
        MealComponent burgerAgain = MealComponentFactory.getComponent("main", "Burger");
        MealComponent friesAgain = MealComponentFactory.getComponent("side", "Fries");

        burgerAgain.serve();
        friesAgain.serve();

        // Display the total number of unique components created
        System.out.println("\nTotal unique components created: " + MealComponentFactory.getTotalComponents());
    }
}
