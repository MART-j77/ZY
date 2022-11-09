package 简单工厂模式例题;

public class Client {
    public static void main(String args[]){
        Chart chart;
        chart = ChartFactory.getChart("histogram");
        chart.display();
    }
}
