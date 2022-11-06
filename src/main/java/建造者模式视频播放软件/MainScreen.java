package 建造者模式视频播放软件;

public class MainScreen {
    public String menu;  //菜单
    public String playList;  //播放列表
    public String mainWindow;  //主窗口
    public String controlBar;  //控制条
    public String getMenu() {
        return menu;
    }
    public void setMenu(String menu) {
        this.menu = menu;
    }
    public String getPlayList() {
        return playList;
    }
    public void setPlayList(String playList) {
        this.playList = playList;
    }
    public String getMainWindow() {
        return mainWindow;
    }
    public void setMainWindow(String mainWindow) {
        this.mainWindow = mainWindow;
    }
    public String getControlBar() {
        return controlBar;
    }
    public void setControlBar(String controlBar) {
        this.controlBar = controlBar;
    }


}