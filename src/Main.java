import CreationalDesignPatterns.Singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
        singleton.setSomeName("New name");
        System.out.println(singleton);
    }
}