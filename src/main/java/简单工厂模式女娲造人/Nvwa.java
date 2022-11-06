package 简单工厂模式女娲造人;

public class Nvwa {
    public static Person getPerson(String person) throws Exception {
        if (person.equalsIgnoreCase("M")){
            return new Man();
        }else if (person.equalsIgnoreCase("W")){
            return new Woman();
        }else if (person.equalsIgnoreCase("R")){
            return new Robot();
        }else {
            throw new Exception("对不起，不能造该类人");
        }
    }
}