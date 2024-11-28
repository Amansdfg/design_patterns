package labs.task10.visitor;

public class MealVisitor implements Visitor {
    private int totalCalories = 0;
    private StringBuilder orderReport = new StringBuilder();

    @Override
    public void visit(MenuItem menuItem) {
        totalCalories += menuItem.getCalories();
        orderReport.append(String.format("Item: %s, Calories: %d, Price: $%.2f\n", 
                                         menuItem.getName(), menuItem.getCalories(), menuItem.getPrice()));
    }

    @Override
    public void visit(Order order) {
        for (MenuItem item : order.getItems()) {
            item.accept(this);
        }
        orderReport.append(String.format("Total Calories: %d\n", totalCalories));
    }

    @Override
    public void visit(User user) {
        orderReport.append(String.format("User: %s, Loyalty Points: %d\n", 
                                         user.getName(), user.getLoyaltyPoints()));
    }

    public String getOrderReport() {
        return orderReport.toString();
    }
}
