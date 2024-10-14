package labs.Task4.Bridge;

public class SteamedStyle implements PreparationStyle {
    @Override
    public void prepare(String meal) {
        System.out.println("Steaming " + meal);
    }
}
