package CreationalDesignPatterns.Tast3;

public class MealOrderSystem {
    public static void main(String[] args) {

        Menu menu = Menu.getInstance();
        menu.showMenu();

        Meal meal1 =new  Meal.MealBuilder("Burger")
            .side("Fries")
            .drink("Soda")
            .dessert("Cake")
            .build();
        System.out.println("\nFirst Meal: " + meal1);

        Meal meal2 =new  Meal.MealBuilder("Pasta")
            .side("Salad")
            .drink("Juice")
            .build();
        System.out.println("\nSecond Meal: " + meal2);


        CloneableMeal cloneableMeal1 = new CloneableMeal(meal1.getMainDish(), meal1.getSide(), meal1.getDrink(), meal1.getDessert());
        CloneableMeal clonedMeal = cloneableMeal1.clone();
        System.out.println("\nCloned Meal: " + clonedMeal);


        CloneableMeal modifiedClonedMeal = new CloneableMeal(clonedMeal.getMainDish(), clonedMeal.getSide(), "Water", clonedMeal.getDessert());
        System.out.println("\nModified Cloned Meal: " + modifiedClonedMeal);
    }
}
