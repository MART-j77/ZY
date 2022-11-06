package 简单工厂模式几何图形;

public class Triangle implements Shape{

    @Override public void draw() {
        System.out.println("绘制三角形");
    }
    @Override public void erase() {
        System.out.println("擦除三角形");
    }


}
