package 抽象工厂模式海尔工厂;

public class HairerFactory implements DianQiFactory {

    public Kongtiao createkongtiao() {   //海尔工厂生产海尔空调

        return new Hairer_Kong_Tiao();
    }

    public Tv createtv() {                  //海尔工厂生产海尔电视节
        return new Hairer_Tv();
    }

}