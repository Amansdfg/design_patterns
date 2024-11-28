package StructuralDesignPatterns.Facade;

public class SoundSystem {
    public void on() {
        System.out.println("Sound system is on.");
    }
    public void setVolume(int level) {
        System.out.println("Setting sound volume to " + level);
    }
    public void off() {
        System.out.println("Sound system is off.");
    }
}