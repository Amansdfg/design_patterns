package labs.Tast3;

public class Menu {
    private static Menu instance;

    private Menu() {

    }

    public static Menu getInstance() {
        if (instance == null) {
            instance = new Menu();
        }
        return instance;
    }

    public void showMenu() {
        System.out.println("Restaurant Menu:");
        System.out.println("Main Dishes: Burger, Pasta");
        System.out.println("Sides: Fries, Salad");
        System.out.println("Drinks: Soda, Juice");
        System.out.println("Desserts: Cake, Ice Cream");
    }
}
