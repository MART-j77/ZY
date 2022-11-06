package 抽象工厂模式数据库;

public class Client {

    public void test1(){
        DBUtil data;
        Connection connect;
        Statement state;
        //getBean()的返回类型是Object,此处需要进行强制类型转换
        data = (DBUtil) XMLUtil.getBean();
        connect = data.produceConnection();
        connect.where();
        state = data.produceStatement();
        state.execute();
    }
}
