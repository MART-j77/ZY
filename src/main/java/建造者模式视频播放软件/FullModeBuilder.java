package 建造者模式视频播放软件;

public class FullModeBuilder extends ModeBuilder{

    @Override
    public void buildMenu() {
        screen.setMenu("完整菜单");
    }

    @Override
    public void buildPlayList() {
        screen.setPlayList("完整播放列表");
    }

    @Override
    public void buildMainWindow() {
        screen.setMainWindow("完整主窗口");
    }

    @Override
    public void buildControlBar() {
        screen.setControlBar("完整控制条");
    }

}
