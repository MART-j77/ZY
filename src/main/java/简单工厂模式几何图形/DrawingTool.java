package 简单工厂模式几何图形;


    public class DrawingTool {
        public static void main(String[] args) {
            Shape s1, s2, s3, s4;
            try {
                s1 = ShapeFactory.createShape("圆形");
                s2 = ShapeFactory.createShape("矩形");
                s3 = ShapeFactory.createShape("三角形");
                s1.draw();s1.erase();
                s2.draw();s2.erase();
                s3.draw();s3.erase();
                // s4.draw(); // s4.erase(); //去掉则异常
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
