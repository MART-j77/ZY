package 简单工厂模式女娲造人;

public class Robot implements Person{
    public Robot() {
    }

    @Override
    public void create() {
        System.out.println("造机器人");
    }
}
