package labs.Task4.Adapter;


public class ExternalDeliveryService {
    public void sendExternalOrder(String orderDetails) {
        System.out.println("Order sent to external delivery service: " + orderDetails);
    }
}
