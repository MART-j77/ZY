package 简单工厂模式女娲造人;

public class Woman implements Person {
    public Woman() {
    }

    @Override
    public void create() {
        System.out.println("造女人");
    }
}