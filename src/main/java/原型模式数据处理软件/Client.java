package 原型模式数据处理软件;


public class Client {
    public  static void main(String args[])
    {
        DataChart  datachart1, datachart2 = null;
        datachart1  = new DataChart(); //创建原型对象
        try
        {
            datachart2 =  datachart1.deepClone(); //调用深克隆方法创建克隆对象
        }
        catch(Exception e){
            System.out.println("克隆失败！");
        }
        System.out.println(datachart1==datachart2);
        System.out.println(datachart1.getDs()==datachart2.getDs());
        System.out.println(datachart1.getColor()==datachart2.getColor());
    }
}