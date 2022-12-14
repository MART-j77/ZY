package 抽象工厂模式例题;

public class SummerSkinFactory implements SkinFactory{
    public Button createButton(){
        return new SummerButton();
    }
    public TextField createTextField(){
        return new SummerTextField();
    }
    public ComboBox createComboBox(){
        return new SummerComboBox();
    }
}
