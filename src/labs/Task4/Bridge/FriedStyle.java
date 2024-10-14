package labs.Task4.Bridge;

public class FriedStyle implements PreparationStyle {
    @Override
    public void prepare(String meal) {
        System.out.println("Frying " + meal);
    }
}
