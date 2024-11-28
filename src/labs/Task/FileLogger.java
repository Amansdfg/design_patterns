package labs.Task;

public class FileLogger extends Logger{

    @Override
    public Account createLogger() {
        return new File();
    }
}
