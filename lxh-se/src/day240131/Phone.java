package day240131;

public class Phone {
    //state  (stores its state in fields) 将其状态存储在字段中
    String brand;
    String name;

    public Phone(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

    //behavior (exposes its behavior through methods) 通过方法公开其行为
    void call(String PhoneNumber) {
        System.out.println("正在用[" + this.name + "]打电话给:" + PhoneNumber);
    }

    void msg(String PhoneNumber,String text) {
        System.out.println("正在用[" + this.name + "]发消息给:" + PhoneNumber + ",内容是:" + text);
    }

}

