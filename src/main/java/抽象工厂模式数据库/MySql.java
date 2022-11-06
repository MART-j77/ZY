package 抽象工厂模式数据库;

public class MySql implements DBUtil {
    @Override
    public Connection produceConnection() {
        return new MySqlConnection();
    }
    @Override
    public Statement produceStatement() {
        return new MySqlStatement();
    }
}
