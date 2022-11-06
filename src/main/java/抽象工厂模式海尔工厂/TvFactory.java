package 抽象工厂模式海尔工厂;

public class TvFactory implements DianQiFactory {

    @Override
    public Kongtiao createkongtiao() {
        // TODO 自动生成的方法存根
        return new Tcl_Kong_tiao();
    }

    @Override
    public Tv createtv() {
        // TODO 自动生成的方法存根
        return new Tcl_Tv();
    }

}