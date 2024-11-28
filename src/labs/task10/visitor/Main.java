package labs.task10.visitor;

public class Main {
    public static void main(String[] args) {
        MenuItem burger = new MenuItem("Burger", 500, 5.99);
        MenuItem fries = new MenuItem("Fries", 300, 2.99);
        MenuItem soda = new MenuItem("Something", 150, 1.99);

        Order order = new Order();
        order.addItem(burger);
        order.addItem(fries);
        order.addItem(soda);

        User user = new User("Aman Kalabay", 120);

        MealVisitor visitor = new MealVisitor();
        order.accept(visitor);
        user.accept(visitor);

        System.out.println(visitor.getOrderReport());
    }
}
