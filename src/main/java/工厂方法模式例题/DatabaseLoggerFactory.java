package 工厂方法模式例题;

public class DatabaseLoggerFactory implements  LoggerFactory {
    public Logger createLogger(){
        Logger logger = new DatabaseLogger();
        return logger;
    }
}
