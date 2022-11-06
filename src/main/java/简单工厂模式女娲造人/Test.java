package 简单工厂模式女娲造人;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) throws Exception {
        Scanner type = new Scanner(System.in);
        System.out.print("请输入参数： ");
        String s = type.nextLine();
        Person person = Nvwa.getPerson(s);
        person.create();
        type.close();
    }
}