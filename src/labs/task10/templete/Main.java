package labs.task10.templete;

public class Main {
    public static void main(String[] args) {

        OrderWorkflow takeLunchOrder = new TakeLunchOrder();
        System.out.println("Processing Take lunch Order:");
        takeLunchOrder.processOrder();

        System.out.println();


        OrderWorkflow deliveryOrder = new DeliveryOrder();
        System.out.println("Processing Delivery Order:");
        deliveryOrder.processOrder();

        System.out.println();


        OrderWorkflow takeawayOrder = new TakeawayOrder();
        System.out.println("Processing Takeaway Order:");
        takeawayOrder.processOrder();
    }
}
