package labs.Task4.Bridge;


public class MealPreparationSystem {
    public static void main(String[] args) {

        MealType mainDish = new MainDish("Burger", new GrilledStyle());
        mainDish.prepareMeal();


        MealType sideDish = new SideDish("Fries", new FriedStyle());
        sideDish.prepareMeal();


        MealType steamedVeggies = new SideDish("Vegetables", new SteamedStyle());
        steamedVeggies.prepareMeal();
    }
}

