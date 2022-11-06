package 原型模式数据处理软件;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;

public class DataChart implements Serializable{
    private static final long serialVersionUID = 3672368913840301016L;
    private DataSet ds = new DataSet();
    public int number;  //编号
    public String color;   //颜色
    public int data;   //数据
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }

    public DataSet getDs() {
        return ds;
    }
    public void setDs(DataSet ds) {
        this.ds = ds;
    }
    @Override
    public String toString() {
        return "Gj19DataChart [number=" + number + ", color=" + color
                + ", data=" + data + "]";
    }
    //使用序列化技术实现深克隆
    public DataChart deepClone() throws  IOException, ClassNotFoundException, OptionalDataException
    {
        //将对象写入流中
        ByteArrayOutputStream bao=new  ByteArrayOutputStream();
        ObjectOutputStream oos=new  ObjectOutputStream(bao);
        oos.writeObject(this);

        //将对象从流中取出
        ByteArrayInputStream bis=new  ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois=new  ObjectInputStream(bis);
        return  (DataChart)ois.readObject();
    }
}