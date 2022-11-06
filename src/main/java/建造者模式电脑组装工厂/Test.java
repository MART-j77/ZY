package 建造者模式电脑组装工厂;

public class Test {
    public static void main(String []args) {
        DesignA a=new DesignA();
        Designer designer = new Designer(a);
        Computer com=designer.construct();
        System.out.println("电脑的A组装方案：");
        System.out.print(com.toString());
    }
}
