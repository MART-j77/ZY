package 工厂方法模式例题;

public class FileLoggerFactory implements LoggerFactory {
    public Logger createLogger(){
        Logger logger = new FileLogger();
        return logger;
    }
}
