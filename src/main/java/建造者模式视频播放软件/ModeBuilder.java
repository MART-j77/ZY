package 建造者模式视频播放软件;

abstract class ModeBuilder {
    protected MainScreen screen = new MainScreen();   //创建产品对象
    public abstract void buildMenu();
    public abstract void buildPlayList();
    public abstract void buildMainWindow();
    public abstract void buildControlBar();
    public MainScreen getScreen()  {    //返回产品对象 --工厂方法
        return screen;
    }
}