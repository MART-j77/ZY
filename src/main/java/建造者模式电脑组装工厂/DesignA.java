package 建造者模式电脑组装工厂;

public class DesignA extends ComputerBuilder{
    @Override
    public void buildCPU() {
        // TODO Auto-generated method stub
        getComputer().setCPU("cpu1号");
    }
    @Override
    public void buildStorage() {
        // TODO Auto-generated method stub
        getComputer().setStorage("内存条1号");
    }
    @Override
    public void buildDisplayCard() {
        // TODO Auto-generated method stub
        getComputer().setDisplayCard("显卡1号");
    }
    @Override
    public void buildMainBoard() {
        // TODO Auto-generated method stub
        getComputer().setMainboard("主板1号");
    }
    @Override
    public void buildDisc() {
        // TODO Auto-generated method stub
        getComputer().setDisc("硬盘1号");
    }
    @Override
    public void buildDisplayDevice() {
        // TODO Auto-generated method stub
        getComputer().setDisplayDevice("显示器1号");
    }
    @Override
    public void buildKeyboard() {
        // TODO Auto-generated method stub
        getComputer().setKeyboard("键盘1号");
    }
    @Override
    public void buildMouse() {
        // TODO Auto-generated method stub
        getComputer().setMouse("鼠标");
    }
}