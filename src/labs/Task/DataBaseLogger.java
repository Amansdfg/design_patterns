package labs.Task;

public class DataBaseLogger extends Logger{
    @Override
    public Account createLogger() {
        return new DataBase();
    }
}
