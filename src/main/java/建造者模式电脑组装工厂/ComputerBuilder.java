package 建造者模式电脑组装工厂;

public abstract class ComputerBuilder {
    Computer computer=new Computer();
    public abstract void buildCPU();
    public abstract void buildStorage();
    public abstract void buildDisplayCard();
    public abstract void buildMainBoard();
    public abstract void buildDisc();
    public abstract void buildDisplayDevice();
    public abstract void buildKeyboard();
    public abstract void buildMouse();
    public Computer getComputer() {
        return computer;
    }
}