package 简单工厂模式几何图形;


public class UnSupportedShapeException extends Exception {
    public UnSupportedShapeException(String message) {
        super(message);
    }
}