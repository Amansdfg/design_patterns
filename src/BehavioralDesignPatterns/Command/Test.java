package BehavioralDesignPatterns.Command;

public class Test {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();
        remote.executeCommand(lightOn);
        remote.executeCommand(lightOff);
        remote.undo();
        remote.undo();
    }
}

