package labs.Task;

public class Test {
    public static void main(String[] args) {

        Logger console = new ConsoleLogger();
        Logger data = new DataBaseLogger();
        Logger file = new FileLogger();

        Account consoleLogger=console.createLogger();

        Account dataLogger=data.createLogger();
        Account fileLogger=file.createLogger();
        consoleLogger.account();
        dataLogger.account();
        fileLogger.account();

    }
}
