package labs.Task4.Adapter;

import labs.Tast3.Meal;

public class InternalOrderService implements OrderService {
    @Override
    public void placeOrder(Meal meal) {
        System.out.println("Placing order for: " + meal);
    }
}
