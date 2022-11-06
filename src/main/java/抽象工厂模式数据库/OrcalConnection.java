package 抽象工厂模式数据库;

public class OrcalConnection implements Connection {
    @Override
    public void where() {
        System.out.println("连接到Orcal...");
    }
}