package 建造者模式视频播放软件;

public class SimpleModeBuilder extends ModeBuilder{

    @Override
    public void buildMenu() {
        screen.setMenu("精简菜单");
    }

    @Override
    public void buildPlayList() {
        screen.setPlayList("精简播放列表");
    }

    @Override
    public void buildMainWindow() {
        screen.setMainWindow("精简主窗口");
    }

    @Override
    public void buildControlBar() {
        screen.setControlBar("精简控制条");
    }

}