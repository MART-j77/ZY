package 抽象工厂模式数据库;

public interface DBUtil {
    public Connection produceConnection();
    public Statement produceStatement();

}
