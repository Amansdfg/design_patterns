package labs.Task4.Bridge;

public  class GrilledStyle implements PreparationStyle {
    @Override
    public void prepare(String meal) {
        System.out.println("Grilling " + meal);
    }
}