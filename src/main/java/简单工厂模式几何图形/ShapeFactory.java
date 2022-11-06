package 简单工厂模式几何图形;

public class ShapeFactory {
    public static Shape createShape(String type) throws UnSupportedShapeException {
        Shape shape;
        if ("圆形".equals(type)) {
            shape = new Circle();
        }
        else if ("矩形".equals(type)) {
            shape = new Rectangle();
        }
        else if ("三角形".equals(type)) {
            shape = new Triangle();
        }
        else {
            throw new UnSupportedShapeException("UnSupportedShapeException");
        }
        return shape;
    }
}