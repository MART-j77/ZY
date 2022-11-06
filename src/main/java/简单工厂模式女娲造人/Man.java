package 简单工厂模式女娲造人;

public class Man implements Person{
    public Man() {
    }

    @Override
    public void create() {
        System.out.println("造男人");
    }
}
