package CreationalDesignPatterns.Singleton;

import CreationalDesignPatterns.Asa.Laptop;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
        singleton.setSomeName("New name");
        System.out.println(singleton);
    }
}
