package labs.Task4.Adapter;

import labs.Tast3.Meal;

public class ExternalOrderAdapter implements OrderService {
    private ExternalDeliveryService externalDeliveryService;

    public ExternalOrderAdapter(ExternalDeliveryService externalDeliveryService) {
        this.externalDeliveryService = externalDeliveryService;
    }
    @Override
    public void placeOrder(Meal meal) {
        String orderDetails = meal.getMainDish() + ", " + meal.getSide() + ", " + meal.getDrink() + ", " + meal.getDessert();
        externalDeliveryService.sendExternalOrder(orderDetails);
    }
}
