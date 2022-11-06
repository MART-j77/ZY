package 抽象工厂模式数据库;

public class Orcal implements DBUtil {
    @Override
    public Connection produceConnection() {
        return new OrcalConnection();
    }
    @Override
    public Statement produceStatement() {
        return new OrcalStatement();
    }
}