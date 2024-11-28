package labs.Task4.Adapter;

import labs.Tast3.Meal;


 /**
 *
 * {@code Adapter}<p>
  *
  *
  *
  *
 * <blockquote><pre>Also known as: Wrapper</pre></blockquote><p>
 *
 * Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.
 *<p>
  Steps: <p>
  *Define an interface for placing orders within the Meal Order System.<p>
  *Implement this interface for internal use (regular order).<p>
  *Create an external service with a different method signature.<p>
  *Implement an adapter to connect the internal order interface with the external service.<p>
  *@author  Aman
 */
public class MealOrderSystem {
    public static void main(String[] args) {
        Meal meal = new Meal.MealBuilder("Burger").side("Fries").drink("Soda").dessert("Cake").build();
        System.out.println("\nMeal: " + meal);

        // Internal order service
        OrderService internalService = new InternalOrderService();
        internalService.placeOrder(meal);

        // External delivery service using adapter
        ExternalDeliveryService externalService = new ExternalDeliveryService();
        OrderService externalAdapter = new ExternalOrderAdapter(externalService);
        externalAdapter.placeOrder(meal);
    }
}

