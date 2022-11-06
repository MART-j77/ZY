package 建造者模式电脑组装工厂;

public class Computer {
    private String CPU;
    private String Storage;
    private String DisplayCard;
    private String Mainboard;
    private String Disc;
    private String DisplayDevice;
    private String Keyboard;
    private String Mouse;
    public String getCPU() {
        return CPU;
    }
    public void setCPU(String CPU) {
        this.CPU=CPU;
    }
    public String getStorage() {
        return Storage;
    }
    public void setStorage(String Storage) {
        this.Storage=Storage;
    }
    public String getDisplayCard() {
        return DisplayCard;
    }
    public void setDisplayCard(String DisplayCard) {
        this.DisplayCard=DisplayCard;
    }
    public String getMainboard() {
        return Mainboard;
    }
    public void setMainboard(String Mainboard) {
        this.Mainboard=Mainboard;
    }
    public String getDisc() {
        return Disc;
    }
    public void setDisc(String Disc) {
        this.Disc=Disc;
    }
    public String getDisplayDevice() {
        return DisplayDevice;
    }
    public void setDisplayDevice(String DisplayDevice) {
        this.DisplayDevice=DisplayDevice;
    }
    public String getKeyboard() {
        return Keyboard;
    }
    public void setKeyboard(String Keyboard) {
        this.Keyboard=Keyboard;
    }
    public String getMouse() {
        return Mouse;
    }
    public void setMouse(String Mouse) {
        this.Mouse=Mouse;
    }
    public String toString() {
        return "CPU:"+CPU+"\n内存条:"+Storage+"\n显卡:"+DisplayCard+
                "\n主板:"+Mainboard+"\n硬盘:"+Disc+"\n显示器:"+DisplayDevice+
                "\n键盘:"+Keyboard+"\n鼠标:"+Mouse;
    }
}
