package labs.task10.templete;

public class TakeawayOrder extends OrderWorkflow {

    @Override
    protected void prepareMeal() {
        System.out.println("Preparing the meal for takeaway...");
    }

    @Override
    protected void completeOrder() {
        System.out.println("Packing the meal for the customer.");
    }
}
