package 建造者模式视频播放软件;

public class TestBuilderPattern {
    public static void main(String[] args) {
        ModeBuilder mb;  //针对抽象建造者编程
        mb = new FullModeBuilder();  //构造完整模式界面

        ScreenModeController smc=new ScreenModeController();

        MainScreen screen;
        screen = smc.construct(mb) ;
        System.out.println("菜单："+screen.getMenu());
        System.out.println("播放列表："+screen.getPlayList());
        System.out.println("主窗口："+screen.getMainWindow());
        System.out.println("控制条："+screen.getControlBar());
    }
}