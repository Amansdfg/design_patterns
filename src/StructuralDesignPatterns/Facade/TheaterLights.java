package StructuralDesignPatterns.Facade;

public class TheaterLights {
    public void dim(int level) {
        System.out.println("Dimming lights to " + level + "%.");
    }
    public void on() {
        System.out.println("Lights are on.");
    }
}