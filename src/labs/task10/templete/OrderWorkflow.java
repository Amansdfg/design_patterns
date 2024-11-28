package labs.task10.templete;

public abstract class OrderWorkflow {


    public final void processOrder() {
        validateOrder();
        prepareMeal();
        completeOrder();
    }


    protected void validateOrder() {
        System.out.println("Validating the order...");
    }


    protected abstract void prepareMeal();


    protected abstract void completeOrder();
}
