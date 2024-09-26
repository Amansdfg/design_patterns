package CreationalDesignPatterns.Task;

public class ConsoleLogger extends Logger{


    @Override
    public Account createLogger() {
        return new Console();
    }
}
