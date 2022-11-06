package 建造者模式电脑组装工厂;

public class Designer {
    public ComputerBuilder com;
    public Designer(ComputerBuilder com) {
        this.com=com;
    }
    public Computer construct(){
        com.buildCPU();
        com.buildDisc();
        com.buildDisplayCard();
        com.buildDisplayDevice();
        com.buildKeyboard();
        com.buildMainBoard();
        com.buildMouse();
        com.buildStorage();
        return com.getComputer();
    }
}