package labs.task10.templete;

public class DeliveryOrder extends OrderWorkflow {

    @Override
    protected void prepareMeal() {
        System.out.println("Preparing the meal for delivery...");
    }

    @Override
    protected void completeOrder() {
        System.out.println("Assigning the order to a delivery driver.");
    }
}
