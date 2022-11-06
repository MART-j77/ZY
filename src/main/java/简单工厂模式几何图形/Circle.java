package 简单工厂模式几何图形;


public class Circle implements Shape{

    @Override public void draw() {
        System.out.println("绘制圆形");
    }
    @Override public void erase() {
        System.out.println("擦除圆形");
    }
}