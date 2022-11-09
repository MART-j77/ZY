package 抽象工厂模式例题;

public class SpringSkinFactory implements SkinFactory{
    public Button createButton(){
        return new SpringButton();
    }
    public TextField createTextField(){
        return new SpringTextField();
    }
    public ComboBox createComboBox(){
        return new SpringComboBox();
    }
}
