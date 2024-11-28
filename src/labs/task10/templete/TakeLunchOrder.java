package labs.task10.templete;

public class TakeLunchOrder extends OrderWorkflow {

    @Override
    protected void prepareMeal() {
        System.out.println("Preparing the meal for Take lunch...");
    }

    @Override
    protected void completeOrder() {
        System.out.println("Notifying the kitchen to serve the order at the table.");
    }
}
