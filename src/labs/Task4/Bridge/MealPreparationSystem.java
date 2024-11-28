package labs.Task4.Bridge;

/**
 *
 * {@code Bridge}<p>
 *
 * Bridge is a structural design pattern that lets you split a large class or a set of closely related classes into two separate hierarchies—abstraction and implementation—which can be developed independently of each other.
 *
 *
 *@author  Aman
 */
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

