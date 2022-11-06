package 抽象工厂模式海尔工厂;

public class Client {

    public static void main(String[] args) {
        // TODO 自动生成的方法存根

        DianQiFactory factory1, factory2; // 两个抽象工厂
        Kongtiao k1, k2; // 空调两个抽象产品
        Tv tv1, tv2; // 电视机两个抽象产品

        factory1 = new HairerFactory(); // factory1 为具体海尔工厂
        k1 = factory1.createkongtiao();
        tv1 = factory1.createtv();
        k1.display();
        tv1.display();

        factory2 = new TvFactory();// factory2位具体的TCL工厂
        k2 = factory2.createkongtiao();// 工厂创建空调
        tv2 = factory2.createtv();// 工厂创建电视机
        k2.display();
        tv2.display();

    }

}